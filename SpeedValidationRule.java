package day7.custom_exception_handling.utils;
import day7.custom_exception_handling.core.*;

public class SpeedValidationRule {
	private static int max_speed;
	private static int min_speed;
	static {
		max_speed = 90;
		min_speed = 40;
	}

	public static void SpeedValidation(double speed) throws SpeedOutOfRangeException {
        if(speed<min_speed)
        	throw new SpeedOutOfRangeException("speed too slow!!!");
        if(speed > max_speed)
        	throw new SpeedOutOfRangeException("speed too fast,Fatal!!!!!");
        System.out.println("speed with in range");
	}
}
