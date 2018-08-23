package design_pattern.chapter11.worker;

public abstract class Worker {
	public void work() {
		goToOffice();
		doWork();
		goToHome();
	}

	protected abstract void doWork();

	private void goToOffice() {
		System.out.println("출근");
	}

	private void goToHome() {
		System.out.println("퇴근");
	}
}
