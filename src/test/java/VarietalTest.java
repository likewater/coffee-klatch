import org.junit.*;
import static org.junit.Assert.*;

public class VarietalTest {

  @Test
  public void VarietalInstantiatesCorrectly_true() {
    Varietal myVarietal = new Varietal();
    assertEquals(true, myVarietal instanceof Varietal);
  }

}
