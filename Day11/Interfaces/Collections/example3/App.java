package Day11.Interfaces.Collections.example3;
import Day11.Interfaces.Collections.example3.ReviewService;

public class App {

    public static void main(String[] args) {

        ReviewService reviewList = new ReviewService();

        reviewList.addReview(
                new Review(103, "Milk", "Good Quality"));

        reviewList.addReview(
                new Review(101, "Bread", "Fresh Product"));

        reviewList.addReview(
                new Review(102, "Milk", "Very Tasty"));

        System.out.println("\nAll Reviews");
        reviewList.ShowReviews();

        System.out.println("\nSearch Review By Product");
        System.out.println(
                reviewList.SearchAReviewByProduct("Milk"));

        System.out.println("\nUpdate Comment By Id");
        reviewList.UpdateACommentByItsId(
                102,
                "Excellent Product");

        reviewList.ShowReviews();

        System.out.println("\nSorting Reviews By Id");
        reviewList.SortReviewListById();

        reviewList.ShowReviews();
    }
}