package day8.core;

import java.util.Date;

public class LicenceRule {
	static Date date = new Date(); // date contain current date

	public static void checkLicence(Date d) throws LicenceException {
		//System.out.println(date);
		if (date.before(d)) {
			System.out.println("Your licence is valid, go ahead");
		} else
			throw new LicenceException();
	}
}
