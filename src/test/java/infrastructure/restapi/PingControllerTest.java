package infrastructure.restapi;

import org.junit.Test;

import static org.junit.Assert.*;

public class PingControllerTest {

    @Test
    public void shouldReturnAStringWithPong() {
        PingController pingController = new PingController();
        String result = pingController.ping();
        assertEquals("pong", result);
    }
}