class GuessGame{
  // Instance variables for Player objects
  Player p1;
  Player p2;
  Player p3;
  public void startGame(){
    // Create three players objects and assign to instances variables
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();
    // variables to hold guesses of players
    int guessp1;
    int guessp2;
    int guessp3;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    // Target number which need to be guesses
    int targetNumber = (int) (Math.random()*10);
    System.out.println("Thinking of a number b/w 0 and 9");
    while(true){
      System.out.println("Number to guess is "+targetNumber);
      p1.guess();
      p2.guess();
      p3.guess();

      guessp1 = p1.number;
      System.out.println("Player one guessed "+guessp1);
      guessp2 = p2.number;
      System.out.println("Player two guessed "+guessp2);
      guessp3 = p3.number;
      System.out.println("Player three guessed "+guessp3);
      if(guessp1 == targetNumber){
        p1isRight = true;
      }
      if(guessp2 == targetNumber){
        p2isRight = true;
      }
      if(guessp3 == targetNumber){
        p3isRight = true;
      }
      if(p1isRight || p2isRight || p3isRight){
        System.out.println("We have a winner!");
        System.out.println("Player one got it right? "+p1isRight);
        System.out.println("Player two got it right? "+p2isRight);
        System.out.println("Player three got it right? "+p3isRight);
        System.out.println("Game over ");
        break;
      }else{
        System.out.println("players will have to try again");
      }
    }


  }
}
class Player {
  int number = 0;
  public void guess(){
    number = (int) (Math.random()*10);
    System.out.println("I am guessing "+number);
  }
}
public class GameLauncher {
  public static void main(String[] args){
    GuessGame game = new GuessGame();
    game.startGame();
  }
}
