package model;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Sep 6, 2022
 */
public class Human {
	//variables
	private	String name,favoriteColor;
	private int age;
	
	//constructors
	public Human() {
		super();
	}
	
	public Human(String name) {
		this.name = name;
	}
	
	public Human(String name,int age,String favoriteColor) {
		this.name = name;
		this.age = age;
		this.favoriteColor = favoriteColor;
	}

	//getters
	public String getName() {
		return name;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public int getAge() {
		return age;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
