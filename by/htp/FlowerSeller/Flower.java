package by.htp.FlowerSeller;

public class Flower {
	
    private String name;
    private String colour;
	private double heightFlower;
	private int deliveryDate;
	private double priceFlower;
	
public Flower(String name, String colour, double heightFlower, int deliveryDate, double price){
	this.name=name;
	this.colour=colour;
	this.heightFlower=heightFlower;
	this.deliveryDate=deliveryDate;
	priceFlower=price;
}
 public String getName(){
	 return name;
 }
  public void setName(String name){
	  this.name=name;
  }
 public String getColour(){
	 return colour;
 }
 public void setColour(String colour){
	 this.colour=colour;
	 }
 public double getHeightFlower(){
	 return heightFlower;
 }
 public void setHeightFlower(double heightFlower){
	 this.heightFlower=heightFlower;
 }
 public int getDeliveryDate(){
	 return deliveryDate;
 }
 public void setDeliveryDate(int deliveryDate){
	 this.deliveryDate=deliveryDate;
 }
 public double getPriceFlower(){
	 return priceFlower;
 }
 public void setPriceFlower(double priceFlower){
	 this.priceFlower=priceFlower;
 }
 @Override
public String toString(){
	 return " name: " + name + " colour: " + colour+" height of flower: " + heightFlower + " delivery date: " + deliveryDate + " price of flower: " + priceFlower;
 }
 }
 

