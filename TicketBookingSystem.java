
public class TicketBookingSystem {

	    private int availableTickets;

	    public TicketBookingSystem(int totalTickets) {
	        this.availableTickets = totalTickets;
	    }

	    public synchronized boolean bookTicket(String customerName) {
	        if (availableTickets > 0) {
	            System.out.println(customerName + " booked a ticket.");
	            availableTickets--;
	            return true;
	        } else {
	            System.out.println(customerName + " failed to book a ticket. No tickets available.");
	            return false;
	        }
	    }

	    public int getAvailableTickets() {
	        return availableTickets;
	    }
	}

	class Customer extends Thread {
	    private TicketBookingSystem ticketBookingSystem;
	    private String customerName;

	    public Customer(TicketBookingSystem system, String name) {
	        this.ticketBookingSystem = system;
	        this.customerName = name;
	    }

	    @Override
	    public void run() {
	        if (!ticketBookingSystem.bookTicket(customerName)) {
	            System.out.println(customerName + " could not book a ticket.");
	        }
	    }
	}

	   
