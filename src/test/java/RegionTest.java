import org.junit.*;
import static org.junit.Assert.*;

public class RegionTest {

  @Test
  public void RegionInstantiatesCorrectly_true() {
    Region myRegion = new Region();
    assertEquals(true, myRegion instanceof Region);
  }

}
