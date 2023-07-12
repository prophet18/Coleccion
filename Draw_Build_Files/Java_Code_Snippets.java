



for (int u = 0; u < 12; u++) {

    gbs[u] = new GameButton(cards[u]);

EventHandler<ActionEvent> u  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
    if (cards[u].active == true) {
        cards[u].active = false;
        --ncarda;
        switch (ncarda) {
        case 1:
            cardmap.remove(1, cards[u]);
            break;
        case 2:
            cardmap.remove(2, cards[u]);
            break;
        case 3:
            cardmap.remove(3, cards[u]);
            break;
    }    			
        
    } else {
        cards[u].active = true;
        ncarda++;
        switch (ncarda) {
        case 1:
            cardmap.put(1, cards[u]);
            break;
        case 2:
            cardmap.put(2, cards[u]);
            break;
        case 3:
            cardmap.put(3, cards[u]);
            break;
    }    			
            
    gbs[u].info();
    }
    
    if (ncarda == 3) {
        bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
        bobo.result();
    }
    
    
}
};

    gbs[u].setOnAction(u);

}