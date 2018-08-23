package design_pattern.chapter11.worker;

public class Designer extends Worker {
	@Override
	protected void doWork() {
		System.out.println("디자인");
	}
}
