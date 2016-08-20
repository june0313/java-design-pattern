package design_pattern.chapter6.practice;

/**
 * Created by wayne on 2016. 6. 14..
 */
public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		TicketMachine ticketMachine = TicketMachine.getInstance();
		Ticket ticket = ticketMachine.issueTicket();
		System.out.println(Thread.currentThread().getName() + "issued ticket number " + ticket.getSerialNumber());
	}
}
