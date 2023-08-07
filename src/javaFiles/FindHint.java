package javaFiles;

import java.io.FileNotFoundException;

public class FindHint {
	
	Card c1, c2, c3;
	CheckMatch chk;
	CardArea ca;
	
	public FindHint() throws FileNotFoundException {
		
		ca = new CardArea();
		
		for (int c = 0; c < 12; c++) {
			for (int d = 0; d < 12; d++) {
				for (int e = 0; e < 12; e++) {
					
					do {
					chk = new CheckMatch(ca.gbs[c].card, ca.gbs[d].card, ca.gbs[e].card);
					
					} while (chk.matchCheck = false);
					if (chk.matchCheck == true) {
						System.out.println(ca.gbs[]
					}
				}
			}
		}
		
	}

}
