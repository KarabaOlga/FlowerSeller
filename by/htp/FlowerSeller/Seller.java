package by.htp.FlowerSeller;

public class Seller implements Calculate {
	
private String name;

public Seller(String name){
	this.name=name;
}
public Bunch createBunch(int sizeFl, int sizeAcc){
	Bunch bunch=new Bunch(sizeFl, sizeAcc);
	return bunch;
}
public void supplementFlower(Flower flower, Bunch bunch){
	bunch.addFlower(flower);
}
public void supplementAccesory(Accesory accesory, Bunch bunch){
	bunch.addAccesory(accesory);
	}

public void printBunch(Bunch bunch){
	Flower[] list=bunch.getFlowers();
	for (int i=0; i<list.length; i++){
		if(list[i]!=null){
		System.out.println(list[i]);
		}
	}
}
/*
 public void printBunch(){
		for (Flower flower: flowers){
			System.out.println(flower);
		}
	}
 */
 public double calculatePriceFlower(Bunch bunch){
		double priceFl = 0;
		Flower[] list=bunch.getFlowers();
		for (int i=0; i<list.length; i++){
			if(list[i]!=null){
				priceFl = priceFl + list[i].getPriceFlower();
			}
		}
	return priceFl;
	}
 public double calculatePriceAccesory(Bunch bunch){
	 double priceAcc = 0;
		Accesory[] list=bunch.getAccesories();
		for (int i=0; i<list.length; i++){
			if(list[i]!=null){
				priceAcc = priceAcc + list[i].getPriceAccesory();
			}
		}
	 return priceAcc;
 }
 public void calculateTotalPrice(Bunch bunch){
	 System.out.println("totalPrice= " +(calculatePriceFlower(bunch)+calculatePriceAccesory(bunch)));
 }
 public String getName(){
	 return name;
 }
 public void setName(String name){
	 this.name=name;
 }
 
}
