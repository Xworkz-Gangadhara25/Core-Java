package com.xworkz.util;
import java.util.Scanner;

import com.xworkz.pizza.PizzaHut;
public class PizzaUtil {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the address");
		String address=sc.next();
		System.out.println("enter the type of pizza");
		String typeOfPizzas=sc.next();
		System.out.println("enter the price");
		double price=sc.nextDouble();
		sc.close();
		PizzaHut pizzaHut = new PizzaHut(address,typeOfPizzas,price);
		System.out.println(pizzaHut.address);
	}
}
