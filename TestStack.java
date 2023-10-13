package day7.test;

import java.util.Scanner;

import day7.core.*;
import day7.tester.Stack;

public class TestStack {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int flag = 0;
			Stack stacks = new FixedStack();
			while (true) {
				System.out.println("Menu:- Choose any option for register Customer details :\n"
						+ "1)Choose Fixed Stack \n2)Choose Growable Stak\n3)Push Details\n4)Pop Details\n5)Exit");
				switch (sc.nextInt()) {
				case 1:
					if (flag != 2) {
						flag = 1;
						stacks = new FixedStack();
						System.out.println("you choose Fixed Stack");
					} else
						System.out.println("you already choose growable stack!!");
					break;
				case 2:
					if (flag != 1) {
						flag = 2;
						stacks = new GrowableStack();
						System.out.println("you choose Growable Stack");
					} else
						System.out.println("you already have choosen Fixed Stack!!");
					break;
				case 3:
					stacks.push();

					break;

				case 4:
					System.out.println(stacks.pop());

					break;

				case 5:
					System.out.println("Thank you for visiting!!!");
					System.exit(0);
					break;

				default:
					System.out.println("Choose correct option");

				}

			}

		}

	}
}
