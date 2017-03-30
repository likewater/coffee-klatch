
public class Review {
  private String reviewGrade;
  private String reviewReview;
  private String reviewPrice;

  public Review(String revGrade, String revReview, String revPrice) {
    reviewGrade = revGrade;
    reviewReview = revReview;
    reviewPrice = revPrice;
  }

  public String getReviewGrade() {
    return reviewGrade;
  }

  public String getReviewReview() {
    return reviewReview;
  }

  public String getReviewPrice() {
    return reviewPrice;
  }

}
