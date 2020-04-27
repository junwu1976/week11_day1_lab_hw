import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle= new WaterBottle();
    }

    @Test
    public void drink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    public void empty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    public void fill(){
        assertEquals(100, waterBottle.getVolume());
    }

}
