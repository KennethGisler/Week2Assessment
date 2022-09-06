package model;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Sep 6, 2022
 */
public class HumanEvents {
	
	public int haveBirthday(Human human) {
		int  age = human.getAge() + 1;
		human.setAge(age);
		return human.getAge();
	}
	
	public String howOld(Human human) {
		String statement = "";
		if(human.getAge() != 1) {
			statement = "I'm " + human.getAge() + " year's old!";
		}else {
			statement = "I'm a " + human.getAge() + " year old!";
		}
		return statement;
	}
	
	public boolean isFavoriteColor(Human human,String color) {
		
		if(human.getFavoriteColor().equalsIgnoreCase(color)) {
			return true;
		}else {
			return false;
		}
	
	}
}
