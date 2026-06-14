package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question14_LoggerTest {

    @Test
    void shouldReturnSameInstance() {

        Question14_Logger logger1 =
                Question14_Logger.getInstance();

        Question14_Logger logger2 =
                Question14_Logger.getInstance();

        assertSame(
                logger1,
                logger2
        );
    }

    @Test
    void shouldLogMessage() {

        Question14_Logger logger =
                Question14_Logger.getInstance();

        assertEquals(
                "LOG: Application Started",
                logger.log(
                        "Application Started"
                )
        );
    }

    @Test
    void multipleCallsShouldUseSameObject() {

        Question14_Logger first =
                Question14_Logger.getInstance();

        Question14_Logger second =
                Question14_Logger.getInstance();

        Question14_Logger third =
                Question14_Logger.getInstance();

        assertSame(
                first,
                second
        );

        assertSame(
                second,
                third
        );
    }
}