package by.htp.FlowerSeller;

public class Bunch {
	
	private Flower[] flowers;
	private int lastIndex;
	private Accesory[] accesories;
	private int index;
		
	public  Bunch(int sizeFl, int sizeAcces){
		lastIndex =0;
		index=0;
		flowers = new Flower[sizeFl];
		accesories= new Accesory[sizeAcces];
	}
	public void addFlower(Flower flower){
		if (lastIndex < flowers.length) {
		  flowers[lastIndex]=flower;
		  lastIndex++;
		  }
		else System.out.println("enough");
	}
	
	public void addAccesory(Accesory accesory){
		if (index < accesories.length) {
			  accesories[index]=accesory;
			  index++;
			  }
			else System.out.println("enough");
	}
	
	public void sortDeliveryDate(){
		Flower temp;
		for (int i = 0; i < flowers.length; i++){
			for (int j = 0; j < flowers.length - 1; j++){
				if (flowers[j].getDeliveryDate() > flowers[j+1].getDeliveryDate()){
					temp = flowers[j];
					flowers[j] = flowers[j+1];
					flowers[j+1] = temp;
				}
			}
		}
	}
	
	/*public void selectSortDeliveryDate(){
		for (int i=0; i<flowers.length; i++){
			int min = flowers[i].getDeliveryDate();
			int min_i= i;
			for (int j = i+1 ; j < flowers.length - 1; j++){
			  if( flowers[j].getDeliveryDate()<min ){
				min=flowers[j].getDeliveryDate();
				min_i=j;
			  }
			}	
			if(i !=min_i){
			Flower tmp=flowers[i];
				flowers[i]=flowers[min_i];
				flowers[min_i]=tmp;
				}
		}
	}
	*/
	public void printHeightFlower(int min, int max){
		for (Flower flower: flowers){
			if (flower.getHeightFlower()> min && flower.getHeightFlower()< max) {
				System.out.println(flower);
				}
			
		} 
	}
	public Flower[] getFlowers(){
		  return flowers;
	}
	public void setFlowers(Flower[] flowers){
		this.flowers=flowers;
	}
	public Accesory[] getAccesories(){
		return accesories;
	}
	public void setAccesories(Accesory[] accesories){
		this.accesories=accesories;
	}
}
	  


