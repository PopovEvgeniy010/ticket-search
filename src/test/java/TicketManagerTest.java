import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Ticket;
import ru.netology.javaqa.TicketManager;
import ru.netology.javaqa.TicketRepository;

public class TicketManagerTest {
    @Test
    public void searh() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        Ticket ticket1 = new Ticket(1, 5000, "SVO", "KZN", "10000");
        Ticket ticket2 = new Ticket(2, 6000, "SVO", "KZN", "11000");
        Ticket ticket3 = new Ticket(3, 7500, "KZN", "SVO", "20000");
        Ticket ticket4 = new Ticket(4, 4000, "SVO", "KZN", "15000");

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        Ticket[] actual = manager.findAll("SVO", "KZN");
        Ticket[] expected = {ticket4, ticket1, ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searh2() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        Ticket ticket1 = new Ticket(1, 5000, "SVO", "KZN", "10000");
        Ticket ticket2 = new Ticket(2, 6000, "SVO", "KZN", "11000");
        Ticket ticket3 = new Ticket(3, 7500, "KZN", "SVO", "20000");
        Ticket ticket4 = new Ticket(4, 4000, "SVO", "KZN", "15000");

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        Ticket[] actual = manager.findAll("KZN", "SVO");
        Ticket[] expected = {ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }
}



