package design_pattern.chapter11.worker;

public class Programmer extends Worker {
	@Override
	protected void doWork() {
		System.out.println("코딩");
	}
}
