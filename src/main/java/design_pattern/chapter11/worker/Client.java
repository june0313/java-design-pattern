package design_pattern.chapter11.worker;

public class Client {
	public static void main(String[] args) {
		Worker worker = new Programmer();
		worker.work();
		System.out.println("----------");
		worker = new Designer();
		worker.work();
	}
}
