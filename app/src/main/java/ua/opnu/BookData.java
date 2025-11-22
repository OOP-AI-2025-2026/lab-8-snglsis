package ua.opnu;

public class BookData implements Comparable<BookData> {

    private final String title;
    private final String author;
    private final int reviews;
    private final double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    private double rating() {
        return reviews == 0 ? 0.0 : total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        int byRating = Double.compare(other.rating(), this.rating());
        return byRating != 0 ? byRating : this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title + " (rating = " + rating() + ")";
    }
}

