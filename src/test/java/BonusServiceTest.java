import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAnderLimit() {
        BonusService service = new BonusService();

        long amount = 1088060;
        boolean registered = true;
        long expected = 326;

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

    @Test
    void shouldCalculateRegisteredOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_666_999;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredOverLimit() {
        BonusService service = new BonusService();

        long amount = 5_000_000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredBoarderLimitHight() {
        BonusService service = new BonusService();

        long amount = 1_663_999;
        boolean registered = true;
        long expected = 499;

       long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredBoarderLimitHight() {
        BonusService service = new BonusService();

        long amount = 4_999_999;
        boolean registered = false;
        long expected = 499;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredBoarderLimitLowBeforeZero() {
        BonusService service = new BonusService();

        long amount = 3334;
        boolean registered = true;
        long expected = 1;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredBoarderLimitLowBeforeZero() {
        BonusService service = new BonusService();

        long amount = 10000;
        boolean registered = false;
        long expected = 1;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredBoarderLimitZero() {
        BonusService service = new BonusService();

        long amount = 3333;
        boolean registered = true;
        long expected = 0;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredBoarderLimitZero() {
        BonusService service = new BonusService();

        long amount = 9999;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredZero() {
        BonusService service = new BonusService();

        long amount = 0;
        boolean registered = true;
        long expected = 0;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredZero() {
        BonusService service = new BonusService();

        long amount = 0;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredBoarderLimitHightst() {
        BonusService service = new BonusService();

        long amount = 2_146_999_999;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredBoarderLimitHightst() {
        BonusService service = new BonusService();

        long amount = 2_146_999_999;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
        @Test
        void shouldCalculateRegisteredBelowZero() {
            BonusService service = new BonusService();

            long amount = -1_663_999;
            boolean registered = true;
            long expected = -499;

            long actual = service.calculate(amount, registered);
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateNotRegisteredBelowZero() {
            BonusService service = new BonusService();

            long amount = -4_999_999;
            boolean registered = false;
            long expected = -499;

            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);
    }
}