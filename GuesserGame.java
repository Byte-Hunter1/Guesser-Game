import java.util.Scanner;

public class GuesserGame{
  public static void main(String[] args){
        Umpire u = new Umpire();
        u.CollectingNumFromGuesser();
        u.CollectingNumFromPlayer();
        u.Comparing();

  }
}

class Guesser{
     int gnum;
     int guessNumber(){
        System.out.println("Guesser, Please guess a number :");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;

     }
}

class Player
{
    int pnum;

    int predictNumber(){
        System.out.println("Please guess a number :");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }
}

class Umpire
{
    int num_from_guesser;
    int num_from_player1;
    int num_from_player2;
    int num_from_player3;

    void CollectingNumFromGuesser(){
        Guesser g = new Guesser();
        num_from_guesser = g.guessNumber();
    }

    void CollectingNumFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        num_from_player1 = p1.predictNumber();
        num_from_player2 = p2.predictNumber();
        num_from_player3 = p3.predictNumber();
    }

    void Comparing(){

        if(num_from_guesser == num_from_player1)
            System.out.println("Yay!! Player1 has won the game!");

        else if(num_from_guesser == num_from_player2)
            System.out.println("Yay!! Player2 has won the game!");

        else if(num_from_guesser == num_from_player3)
            System.out.println("Yay!! Player3 has won the game!");

        else
            System.out.println("Better Luck Next Time!");
    }
}

