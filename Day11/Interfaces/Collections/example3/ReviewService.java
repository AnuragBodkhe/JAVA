package Day11.Interfaces.Collections.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReviewService {

    List<Review> reviewList = new ArrayList<>();

    public void addReview(Review review) {
        reviewList.add(review);
        System.out.println("Review Added Successfully!");
    }

    public Review SearchAReviewByProduct(String product) {

        for (Review rv : reviewList) {
            if (rv.getProduct().equalsIgnoreCase(product)) {
                return rv;
            }
        }
        return null;
    }

    public void UpdateACommentByItsId(int id, String newComment) {

        for (Review rv : reviewList) {
            if (rv.getId() == id) {
                rv.setComments(newComment);
                System.out.println("Comment Updated Successfully!");
                return;
            }
        }

        System.out.println("Review Not Found!");
    }

    public List<Review> SortReviewListById() {

        Collections.sort(reviewList);

        return reviewList;
    }

    public void ShowReviews() {

        for (Review rv : reviewList) {
            System.out.println(rv);
        }
    }
}