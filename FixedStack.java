package day7.core;

import java.util.Scanner;

import day7.tester.Stack;

public class FixedStack implements Stack {
	private int size = MAX_SIZE;
	private static int cnt = -1;
	Customer[] customers = new Customer[size];
	Scanner sc = new Scanner(System.in);

	@Override
	public void push() {
		if (++cnt < size) {
			System.out.println("Enter Customer Details: Id, Name, Address");
			customers[cnt] = new Customer(sc.nextInt(), sc.next(), sc.next());
			System.out.println("successfully pushed into FixedStack");
		} else {
			System.out.println("Stack Overflow");
		}
	}

	@Override
	public Customer pop() {
		if (cnt < 0) {
			System.out.println("Empty Stack");
			Customer temp = null;
			return temp;
		} else {
			return customers[cnt--];
		}
	}
}
