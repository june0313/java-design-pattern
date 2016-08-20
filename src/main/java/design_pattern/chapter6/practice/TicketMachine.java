package design_pattern.chapter6.practice;


/**
 * Created by wayne on 2016. 6. 14..
 */
public class TicketMachine {
	private static final int MAX_ISSUABLE_TICKET_COUNT = 5;

	private static TicketMachine instance;
	private static int issuedTicketCount;

	static {
		instance = null;
		issuedTicketCount = 0;
	}

	private TicketMachine() {}

	synchronized public static TicketMachine getInstance() {
		if (instance == null) {
			instance = new TicketMachine();
		}

		return instance;
	}

	synchronized public Ticket issueTicket() {
		if (isIssuable()) {
			return new Ticket(++issuedTicketCount);
		} else {
			throw new RuntimeException("발행 가능한 티켓 수를 초과하였습니다. 현재 발행중인 티켓 수 : " + issuedTicketCount);
		}
	}

	private boolean isIssuable() {
		return issuedTicketCount < MAX_ISSUABLE_TICKET_COUNT;
	}
}
