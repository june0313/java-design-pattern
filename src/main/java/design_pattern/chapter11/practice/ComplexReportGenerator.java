package design_pattern.chapter11.practice;

import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author wayne
 * @version 1.0
 */
public class ComplexReportGenerator extends ReportGenerator {
	@Override
	protected String addContentsToReport(String report, List<Customer> customers) {
		List<Customer> customersOver100 = getFilteredCustomers(customers);

		report += customersOver100.stream()
			.map(customer -> String.format("%d : %s\n", customer.getPoint(), customer.getName()))
			.collect(Collectors.joining());

		int sum = customersOver100.stream().mapToInt(Customer::getPoint).sum();

		report += String.format("점수 합계 : %d\n", sum);

		return report;
	}

	@Override
	protected String getCustomerCountReport(List<Customer> customers) {
		List<Customer> customersOver100 = getFilteredCustomers(customers);
		return String.format("고객 수 : %d명 입니다\n", customersOver100.size());
	}

	private List<Customer> getFilteredCustomers(List<Customer> customers) {
		return customers.stream().filter(customer -> customer.getPoint() >= 100).collect(toList());
	}
}
