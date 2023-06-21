// Merging original card information with image

package frameworks;

import javafx.scene.image.ImageView;

public class CardData {
	
	CardInfo cInformation;	ImageView cPhotograph;	int cIdentifier;
	
	public CardData(CardInfo cInfo, ImageView cPhoto) {
		cInfo = cInformation;
		cPhoto = cPhotograph;
	}
	
	public CardData(CardInfo cInfo, ImageView cPhoto, int cId) {
		cInfo = cInformation;
		cPhoto = cPhotograph;
		cId = cIdentifier;
	}

}
