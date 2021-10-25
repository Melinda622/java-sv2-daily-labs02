package day05;

public class Movie {
    private String title;
    private int yearOfProduction;
    private double rating;
    private int numberOfReviews;
    private int totalOfReviews;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public double averageRating(int rating) {
        totalOfReviews = totalOfReviews + rating;
        numberOfReviews++;
        return (double) totalOfReviews / (double) numberOfReviews;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public void setTotalOfReviews(int totalOfReviews) {
        this.totalOfReviews = totalOfReviews;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getRating() {
        return rating;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public int getTotalOfReviews() {
        return totalOfReviews;
    }
}
