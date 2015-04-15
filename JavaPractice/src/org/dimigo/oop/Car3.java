package org.dimigo.oop;

/*
 *
 * <pre>
 * org.dimigo.oop
 *		|_ Car3
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 * @User				: MING
 * @author			: 조준희
 * @version			: 1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

	public Car3() {

	}

	public Car3(String newCompany, String newModel, String newColor,
			int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	public Car3(String newCompany, String newModel, String newColor,
			int newMaxSpeed) {
			this(newCompany,newModel,newColor,newMaxSpeed,0);
	}	
	public Car3(String newCompany, String newModel, String newColor) {
		this(newCompany,newModel,newColor,0,0);
	}
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

}
