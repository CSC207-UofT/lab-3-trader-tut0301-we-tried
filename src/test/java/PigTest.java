import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigTest {
    Pig p;

    @Before
    public void setUp() throws Exception {
        p = new Pig();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Oink!", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, p.getPrice());
    }

}
