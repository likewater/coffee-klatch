
public class Review {
  private String reviewGrade;
  private String reviewReview;
  private String reviewPrice;

  public Review(String reviewGrade, String reviewReview, String reviewPrice) {
    this.reviewGrade = reviewGrade;
    this.reviewReview = reviewReview;
    this.reviewPrice = reviewPrice;
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
