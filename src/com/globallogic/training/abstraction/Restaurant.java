package com.globallogic.training.abstraction;

public class Restaurant {
	public static void main(String[] args) {
		Momos steamed = new SteamedMomos(40.00f);
		Momos tandoori = new TandooriMomos(50.00f);
		Momos dragon = new DragonMomos(60.00f);
		steamed.preparation();
		System.out.println("Steamed price: INR "+ steamed.price);
		tandoori.preparation();
		dragon.preparation();
		
		Item water = new Water();
		Item afterMeal = new MouthFreshener();
		water.preparation();
		afterMeal.preparation();
	}
}

//Total Abstraction
//All members are abstract by default
interface Item{
	void preparation();
}

//Class implementing interface
class Water implements Item{
	public void preparation() {
		System.out.println("Available as regular or chilled");
	}
}

class MouthFreshener implements Item{
	public void preparation() {
		System.out.println("Available in sachet");
	}
}

//Partial Abstraction
//All members need not to be abstract
//Abstract class implementing interface
abstract class Momos implements Item{
	float price;
	Momos(float price){
		this.price=price;
	}
	public abstract void preparation(); //Abstract method
}

//Class implementing abstract class
class SteamedMomos extends Momos{
	SteamedMomos(float price) {
		super(price); //Passing value to constructor of parent class
	}
	public void preparation() {
		System.out.println("Steamed");
	}
}
class TandooriMomos extends Momos{
	TandooriMomos(float price) {
		super(price);
	}
	public void preparation() {
		System.out.println("Roasted in tandoor");
	}
}
class DragonMomos extends Momos{
	DragonMomos(float price) {
		super(price);
	}
	public void preparation() {
		System.out.println("Tossed in sauce");
	}
}
