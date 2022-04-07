import org.junit.jupiter.api.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestStream {

    private static Main streamApi;
    @BeforeAll
    public static void init() {
        streamApi = new Main();
    }
    @Test
    public void testOne() {
        List<Integer> result1 = streamApi.findIntegersAfterFour(List.of(1, 2, 3, 4, 5, 6));
        Assertions.assertEquals(List.of(5, 6), result1);
    }
    @Test
    public void testTwo() {
        List<Integer> result2 = streamApi.findIntegersAfterFour(List.of(4, 1, 2, 3, 0, 5, 6));
        Assertions.assertEquals(List.of(1, 2, 3, 0, 5, 6), result2);
    }
    @Test
    public void testThree() {
        List<Integer> result3 = streamApi.findIntegersAfterFour(List.of(1,2,3,4,5,4,4,5,6));
        Assertions.assertEquals(List.of(5,6), result3);
    }
    @Test
    public void testFour() {
        boolean result4 = streamApi.findIntegersOneOrFour(List.of(1, 1, 4, 4, 1, 1));
        Assertions.assertEquals(true, result4);
    }
    @Test
    public void testFive() {
        boolean result5 = streamApi.findIntegersOneOrFour(List.of(4, 4, 4, 4, 4, 4, 4));
        Assertions.assertEquals(false, result5);
    }
    @Test
    public void testSix() {
        boolean result6 = streamApi.findIntegersOneOrFour(List.of(1,1));
        Assertions.assertEquals(false, result6);
    }
}
