package Practice;

import java.util.Scanner;

public class Dog {
	String name, breed;
	int age;
	
	Dog() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dog's name: ");
		name = sc.nextLine();
		System.out.print("Enter dog's breed: ");
		breed = sc.nextLine();
		System.out.print("Enter dog's age: ");
		age = sc.nextInt();
	}
	void Details() {
		System.out.print("Name: " + name + " \nBreed: " + breed +
				" \nAge: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.Details();
	}

}