package day7.custom_exception_handling.core;

public class SpeedOutOfRangeException extends Exception {
                           public SpeedOutOfRangeException(String errormsg) {
							// TODO Auto-generated constructor stub
                        	   System.out.println(errormsg);
						}
}
