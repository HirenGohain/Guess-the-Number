import java.util.Random;
import java.util.Scanner;

/* Write a class game which allows a user to "Guess the Number"*/

class GuessTheNumber{
    Scanner sc = new Scanner(System.in);
    private int num(){
        Random r = new Random();
        int rn = r.nextInt(15);
        return rn;
    }

    public void check(){
        int rn = num();
        boolean isWin = false;
        for (int i=0; i<3;i++){
            System.out.println("\nGuess the number:");
            int n = sc.nextInt();
            if(rn==n){
                System.out.println("Yes, you are right... The guess number is: "+rn);
                isWin = true;
                break;
            }
            else if(rn>n){
                System.out.println("Oh! Ohh!! You have choose a smaller number.");
            }
            else{
                System.out.println("Oh! Ohh!! You have choose a greater number.");
            }
            
        }
        if(isWin)
        System.out.println("\n***You Win***\n");
        else{
            System.out.println("\n***You loss***");
            System.out.println("The number is: "+rn+"\n");
        }
    }

    public void gameBody(){
        check();
        System.out.println("PLAY AGAIN: TYPE N");
        System.out.println("EXIT: TYPE E");
        String isPlay = sc.next();
        isPlay = isPlay.toUpperCase();
        switch(isPlay){
            case "N"->{
                gameBody();
            }
            case "E"->{
                System.out.println("Thank You for Playing with me");
            }
            default->{
                System.out.println("Invelid input!!! Try again latter");
            }
        }
    }
}



abstract class Main{
    public static void main(String[] args) {
        System.out.println("\n\t***GUESS THE NUMBER***\n");
        System.out.println("Rule: there is a number between [1,15].\nYou have to guess the number within 3times to win the game");
        GuessTheNumber gn = new GuessTheNumber();
        gn.gameBody();
    }
    
}
