package core;

import java.time.LocalDate;

public class Vehicle {
	String chasisNo;
	Color color;
	double basicPrice;
	LocalDate manufactureDate;
	String company;
	boolean isAvailable = true;

	public Vehicle(String chno, Color color, double bp, LocalDate date, String company) {
		chasisNo = chno;
		this.color = color;
		basicPrice = bp;
		manufactureDate = date;
		this.company = company;
	}
	public Vehicle(String chno) { //chasisno is primary key so req'd to check duplicates
	 chasisNo=chno;
	}

	@Override
	public String toString() {
		return "Vehicle details : " + chasisNo + " " + color + " " +"NetPrice = "+color.getAdditonalCost()*basicPrice + " " + manufactureDate + " " + company;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in vehicle equal");
		if (obj instanceof Vehicle) {
			Vehicle anothervehicle = (Vehicle) obj;
			return this.chasisNo.equals(anothervehicle.chasisNo);

		}
		return false;
	}
}
