package WarCardGame;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class App {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Would you like to play a game? (y/n; yes/no; Y/N; Yes/No)");
        String answer = userInput.next();

        if(answer.equals("yes") || answer.equals("y")|| answer.equals("Yes") || answer.equals("Y")){
            //create players
            Player player1 = new Player();
            Player player2 = new Player();
            //ask human player for name
            System.out.print("What is your name? ");
            String name = userInput.next();
            player1.setName(name);
            player2.setName("SuperJava");
            //introduce players
            System.out.println("Hello " + player1.getName());
            System.out.println("I am " + player2.getName());
           delay();


            Deck gameDeck = new Deck();
            System.out.println("This is your new Game Deck.");
            delay();
            line();
            gameDeck.describe();
            line();



            System.out.println("I will shuffle the cards.");
            delay();
            line();
            gameDeck.shuffleDeck();
            gameDeck.describe();
            System.out.println("The cards have been shuffled.");
            line();
          delay();

        /*player1.drawHand(gameDeck);
        player1.describe();
        System.out.println();
        player2.drawHand(gameDeck);
        player2.describe();*/

            //I did not use a loop iterating 52 times.
            //Iterating 26 times and sequentially drawing one card per player is simpler and requires less code.
            for(int i=1;i<=26;i++){
                player1.drawHand(gameDeck);
                player2.drawHand(gameDeck);
            }

            System.out.println("I will now deal the cards.");
            line();
            delay();
            player1.describe();
            System.out.println();
            player2.describe();
            System.out.println();
            System.out.println("Let's play...");
            delay();

            for(int i=1;i<=26;i++){
                Card showPlayer1 = player1.flip();
                Card showPlayer2 = player2.flip();

                System.out.print(player1.getName() + " plays -->");
                showPlayer1.describe();
                System.out.print(player2.getName() + " plays -->");
                showPlayer2.describe();


                if(showPlayer1.getValue() > showPlayer2.getValue()){
                    player1.incrementScore();
                    System.out.println(player1.getName() + " wins this hand. Score: " + player1.getScore());
                    System.out.println();
                }else{
                    player2.incrementScore();
                    System.out.println(player2.getName() + " wins this hand. Score: " + player2.getScore());
                    System.out.println();
                }
                delay();


            }
            line();
            System.out.println("Final Score -- " + player1.getName() + ": "+ player1.getScore() + "  " + player2.getName() + ": " + player2.getScore());
            if(player1.getScore() > player2.getScore()){
                System.out.println(player1.getName() + " is the winner!");
            } else if (player2.getScore() > player1.getScore()) {
                System.out.println(player2.getName() + " is the winner!");
            }else
                System.out.println("It is a Draw! Play Again!");

        }else
            System.out.println("Ok. Goodbye.... Chickenbird!! ()>");



    }

    public static void line(){
        //method to print separation lines between homework prompts
        System.out.println("__________________________________________________________________________________________");
        System.out.println();//print an emptly line
    }
    public static void delay(){
        //create a delay to yallow each hand to be observed during the game.
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
