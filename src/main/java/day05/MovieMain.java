package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Batman", 1989);
        movie.setTotalOfReviews(10);
        movie.setNumberOfReviews(2);

        System.out.println(movie.averageRating(5));
        System.out.println(movie.getNumberOfReviews());

    }
}
