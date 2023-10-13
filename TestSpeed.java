package day7.custom_exception_handling.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import day7.custom_exception_handling.core.SpeedOutOfRangeException;
import day8.core.LicenceException;

import static day8.core.LicenceRule.*;
import static day7.custom_exception_handling.utils.SpeedValidationRule.*;

public class TestSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your licence's expiring date(in dd-mm-yyyy):");
			Date d = sdf.parse(sc.next());//convert string into date(in pattern which give in instance cration time line no.17
			System.out.println("your licence expired date is");
			System.out.println(sdf.format(d)); //convert date to string by using format(date)
		    checkLicence(d);
		    
			System.out.println("enter current speed");
			SpeedValidation(sc.nextDouble());
			System.out.println("no exception arise great");
		} catch (SpeedOutOfRangeException e) {
			//e.getMessage(); give same msg of Sop(e);
			e.getStackTrace();
			e.printStackTrace();
			System.out.println(e);
			System.out.println("custom_exception handling now");
		}
		catch(LicenceException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("All Exception handle");
		}
		System.out.println("now succesfully implement custom exception handling");
	}

}
