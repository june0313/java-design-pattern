package design_pattern.chapter11.practice;

import java.util.List;

/**
 * @author wayne
 * @version 1.0
 */
public abstract class ReportGenerator {
	public String generate(List<Customer> customers) {
		String report = getCustomerCountReport(customers);
		report = addContentsToReport(report, customers);
		return report;
	}

	protected abstract String addContentsToReport(String report, List<Customer> customers);
	protected abstract String getCustomerCountReport(List<Customer> customers);
}
