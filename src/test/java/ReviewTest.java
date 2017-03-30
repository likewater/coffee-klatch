import org.junit.*;
import static org.junit.Assert.*;

public class ReviewTest {

  @Test
  public void ReviewInstantiatesCorrectly_true() {
    Review myReview = new Review("Specialty", "Great", "12.99");
    assertEquals(true, myReview instanceof Review);
  }

  @Test
  public void getReviewGrade_returnsReviewGrade_string() {
    Review myReview = new Review("Specialty", "Great", "12.99");
    assertEquals("Specialty", myReview.getReviewGrade());
  }

  @Test
  public void getReviewReview_returnsReviewReview_string() {
    Review myReview = new Review("Specialty", "Great", "12.99");
    assertEquals("Great", myReview.getReviewReview());
  }

  @Test
  public void getReviewPrice_returnsReviewPrice_string() {
    Review myReview = new Review("Specialty", "Great", "12.99");
    assertEquals("12.99", myReview.getReviewPrice());
  }

}
