package day7.core;

import java.util.Scanner;

import day7.tester.Stack;

public class GrowableStack implements Stack {
	private static int size = MAX_SIZE;
	private static int cnt = -1;
	Customer[] customers = new Customer[size];
	Scanner sc = new Scanner(System.in);

	@Override
	public void push() {
		if (++cnt < size) {
			System.out.println("Enter Customer Details: Id, Name, Address");
			customers[cnt] = new Customer(sc.nextInt(), sc.next(), sc.next());
		} else {size=size*2;
		System.out.println("Enter Customer Details: Id, Name, Address");
			Customer[] temp = new Customer[size];
			for(int i=0;i<cnt;i++) {
				temp[i]=customers[i];
			}
			temp[cnt]=new Customer(sc.nextInt(),sc.next(),sc.next());
			customers = temp;
		}
		System.out.println("successfully pushed into GrowableStack");
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
