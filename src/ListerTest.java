import static org.junit.Assert.*;

public class ListerTest {

    Lister lister = new Lister();

    @org.junit.Test
    public void empty() {

        assertEquals(true, lister.Empty());
    }
}