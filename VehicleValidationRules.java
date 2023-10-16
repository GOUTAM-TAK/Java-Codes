package core;

import static java.time.LocalDate.*;

import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.List;

import customException.VehicleHandlingException;

public class VehicleValidationRules {
	public static void checkForDups(String chasisno, List<Vehicle> vehicles) throws VehicleHandlingException {
		Vehicle newvehicle = new Vehicle(chasisno);
		if (vehicles.contains(newvehicle))
			throw new VehicleHandlingException("duplicates are not allowd!!");
		System.out.println("no duplicate");
	}

	public static Color checkColor(String color)throws IllegalArgumentException {
		return Color.valueOf(color.toUpperCase());
	}
    public static LocalDate checkDate(String date) throws VehicleHandlingException {
    	LocalDate manuDate = parse(date);
    	LocalDate today = parse("2019-12-31");
    	if(today.isBefore(manuDate)) {
    		System.out.println("date is valid!!!");
    		return manuDate;
    	}
    	else {
    		throw new VehicleHandlingException("Invalid Date!!!");
    	}
    }
    public static Vehicle allInputCheck(String chno,String color, double bp,String date, String company,List<Vehicle>vehicles) throws VehicleHandlingException {
    	checkForDups(chno,vehicles);
    Color validColor = checkColor(color);
    LocalDate validDate = checkDate(date);
    return new Vehicle(chno,validColor,bp,validDate,company);
    }
}