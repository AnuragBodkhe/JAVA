package Day11.Interfaces.Collections.example3;

public class Review implements Comparable<Review> {

    private int id;
    private String product;
    private String comments;

    public Review(int id, String product, String comments) {
        this.id = id;
        this.product = product;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Review [id=" + id +
                ", product=" + product +
                ", comments=" + comments + "]";
    }

    @Override
    public int compareTo(Review r) {
        return this.id - r.id;
    }
}