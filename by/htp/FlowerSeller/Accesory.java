package by.htp.FlowerSeller;

public class Accesory {
	
	private String name;
	private double priceAccesory;

	public Accesory(String name, double priceAccesory){
		this.name = name;
		this.priceAccesory = priceAccesory;	
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPriceAccesory(){
		return priceAccesory;
	}
	public void setPriceAccesory(){
		this.priceAccesory=priceAccesory;
	}

}
