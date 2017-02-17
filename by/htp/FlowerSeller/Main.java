package by.htp.FlowerSeller;

public class Main extends Info {

public static void main(String[] args) {	
	
	Seller seller = new Seller ("Nataly");
	Bunch bunch=seller.createBunch(5, 3);
	  
	Flower flower1 = new Flower("carnation", "red", 35, 15, 2.5 );
	Flower flower2 = new Flower("carnation", "red", 36, 10, 2.2);
	Flower flower3 = new Flower("carnation", "red", 36, 12, 2.2);
	Flower flower4 = new Flower("carnation", "white", 34, 15, 2.5 );
	Flower flower5 = new Flower("carnation", "white", 30, 12, 2.4);
	Flower flower6=new Flower("rose", "red", 45, 9, 3.5 );
	Flower flower7=new Flower("rose", "red", 45, 10, 3.5 );
	Flower flower8=new Flower("rose", "red", 40, 11, 3.2 );
	Flower flower9=new Flower("rose", "pink", 38, 12, 3.0 );
	Flower flower10=new Flower("rose", "pink", 38, 13, 3.0 );
	Flower flower11=new Flower("rose", "pink", 30, 15, 2.5 );

	Accesory accesory1 = new Accesory("paper", 0.5);
	Accesory accesory2 = new Accesory("band", 1.2);
	Accesory accesory3 = new Accesory("silver", 2.5);
	Accesory accesory4 = new Accesory("bird", 2.6);
	Accesory accesory5 = new Accesory("butterfly", 2.6);		

 seller.supplementFlower(flower1,bunch); 
 seller.supplementFlower(flower2,bunch);
 seller.supplementFlower(flower3,bunch); 
 seller.supplementFlower(flower4,bunch);
 seller.supplementFlower(flower5,bunch);
 
 seller.supplementAccesory(accesory1, bunch);
 seller.supplementAccesory(accesory2, bunch);
 seller.supplementAccesory(accesory3, bunch);
 
 System.out.println("Flower list ");
 System.out.println("");
 seller.printBunch(bunch);
 bunch.sortDeliveryDate();
 // bunch.selectSortDeliveryDate();
 System.out.println("");
 System.out.println("Sorted by freshless flower list ");
 System.out.println("");
 seller.printBunch(bunch);
 System.out.println("");
 System.out.println(" Accoding interval min-max value of stem");
 System.out.println("");
 bunch.printHeightFlower(28, 35);
 System.out.println("");
 seller.calculatePriceFlower(bunch);
 seller.calculatePriceAccesory(bunch);
 seller.calculateTotalPrice(bunch);
	}

}
