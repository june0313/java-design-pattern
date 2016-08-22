package design_pattern.chapter11.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wayne
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();

		customerList.add(new Customer("홍길동", 150));
		customerList.add(new Customer("우수한", 350));
		customerList.add(new Customer("부족한", 50));
		customerList.add(new Customer("최고의", 550));
		customerList.add(new Customer("훌륭한", 450));

		ComplexReportGenerator generator = new ComplexReportGenerator();
		System.out.println(generator.generate(customerList));
	}
}
