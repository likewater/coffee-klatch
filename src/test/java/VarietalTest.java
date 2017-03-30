import org.junit.*;
import static org.junit.Assert.*;

public class VarietalTest {

  @Test
  public void VarietalInstantiatesCorrectly_true() {
    Varietal myVarietal = new Varietal("Sulawase");
    assertEquals(true, myVarietal instanceof Varietal);
  }

  @Test
  public void getVarietalName_returnsVarietalName_string() {
    Varietal myVarietal = new Varietal("Sulawase");
    assertEquals("Sulawase", myVarietal.getVarietalName());
  }


//end of class
}
