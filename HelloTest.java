
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Before test");
    }

    @Test
    public void Hello() throws Exception {
        assertEquals(10,new Hello().print());
    }
    @After
    public void teardown(){
        System.out.println("After test");

    }



}