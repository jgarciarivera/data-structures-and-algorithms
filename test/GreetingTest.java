import com.jgarciarivera.practice.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreetingTest {

    Greeting greeting;

    @BeforeEach
    public void setup() {
        greeting = new Greeting();
    }

    @Test
    public void canary() {
        assertTrue(true);
    }

    @Test
    public void givenBob_returnsHelloBob() {
        String[] names = {"Bob"};
        assertEquals("Hello, Bob.", greeting.sayHello(names));
    }

    @Test
    public void givenNull_returnsHelloMyFriend() {
        assertEquals("Hello, my friend.", greeting.sayHello(null));
    }

    @Test
    public void givenUppercaseName_returnsUppercaseGreeting() {
        String[] names = {"JERRY"};
        assertEquals("HELLO JERRY!", greeting.sayHello(names));
    }

    @Test
    public void givenTwoNames_returnsHelloJillAndJane() {
        String[] names = {"Jill", "Jane"};
        assertEquals("Hello, Jill and Jane.", greeting.sayHello(names));
    }

    @Test
    public void givenMultipleNames_returnsHelloAmyBrianAndCharlotte() {
        String[] names = {"Amy", "Brian", "Charlotte"};
        assertEquals("Hello, Amy, Brian, and Charlotte.", greeting.sayHello(names));
    }
}
