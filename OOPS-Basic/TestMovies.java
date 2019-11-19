class Movie{
  int rating;
  String title;
  String genre;
  public void playIt(){
    System.out.println("Movie - "+title+" based on "+genre+" and has ratings "+rating);
  }
}
public class TestMovies{
  public static void main(String[] args){
    Movie one = new Movie();
    one.title = "Dark Knight";
    one.genre = "superhero";
    one.rating = 5;
    one.playIt();
    Movie two = new Movie();
    two.title = "John Wick";
    two.genre = "Action";
    two.rating = 5;
    two.playIt();
    System.out.println("Here is end of TestMovies class");

  }
}
