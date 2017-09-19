package demo;

/**
 * CS 2003 - Lab 3
 * Code to display a plethora of information about the given person
 * @author Colton Sutton
 * @version 1.1
 * @since 9/12/2017
 */

public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthDate;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birthDate = bdate;
	}

	//resets the birthday, has yet to implemented or used
	public void reset_birthday(int year){
		birthDate = year;
	}
	//displays info about the person: name, age, birthdate, qualification for senior citizen Medicare status
	public void display_info() {
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthDate);
		age = get_age();
		System.out.printf("I am %d years old ",age);
		System.out.printf(Medicare_senior_citizen(age));
	}
	//get the age of the person and returns it
	public int get_age() {
		age = currentYear - birthDate;
		return age;
	}
	//gets the person's status for being a citizen for Medicare
	public String Medicare_senior_citizen(int age) {
		String qualifications;
		if (age >= 65){
			qualifications = ("\nI'm a senior citizen");
		}else{
			qualifications = ("\nI'm not old enough to be classified as a senior citizen by Medicare!");
		}
		return qualifications;
	}
	
	
	public static void main(String[] args) {
		Person John = new Person("John",1957);
		John.display_info();
		
		
	}

}