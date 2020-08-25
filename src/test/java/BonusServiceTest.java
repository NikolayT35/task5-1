import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAnderLimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNotRegisteredAnderLimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}