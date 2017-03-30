import org.junit.*;
import static org.junit.Assert.*;

public class ReviewTest {

  @Test
  public void ReviewInstantiatesCorrectly_true() {
    Review myReview = new Review();
    assertEquals(true, myReview instanceof Review);
  }

}
