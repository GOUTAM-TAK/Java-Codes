package day7.core;

public class Customer {
	private int id;
	private String name;
	private String address;
	public Customer(int i,String n,String a) {
		id=i;
		name=n;
		address=a;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
