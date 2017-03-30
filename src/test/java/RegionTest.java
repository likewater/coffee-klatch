import org.junit.*;
import static org.junit.Assert.*;

public class RegionTest {

  @Test
  public void RegionInstantiatesCorrectly_true() {
    Region myRegion = new Region("African");
    assertEquals(true, myRegion instanceof Region);
  }

  @Test
  public void getRegionName_returnsRegionName_string() {
    Region myRegion = new Region("Africa");
    assertEquals("Africa", myRegion.getRegionName());
  }


//end of class
}
