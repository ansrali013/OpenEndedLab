
public class MovieTicketSystem {
	 public static void main(String[] args) {
	        TicketBookingSystem system = new TicketBookingSystem(5);
	        Customer customer1 = new Customer(system, "Customer 1");
	        Customer customer2 = new Customer(system, "Customer 2");
	        Customer customer3 = new Customer(system, "Customer 3");
	        Customer customer4 = new Customer(system, "Customer 4");
	        Customer customer5 = new Customer(system, "Customer 5");
	        Customer customer6 = new Customer(system, "Customer 6");

	        
	        customer1.start();
	        customer2.start();
	        customer3.start();
	        customer4.start();
	        customer5.start();
	        customer6.start();

	        try {
	            customer1.join();
	            customer2.join();
	            customer3.join();
	            customer4.join();
	            customer5.join();
	            customer6.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Tickets remaining: " + system.getAvailableTickets());
	    }
	}



