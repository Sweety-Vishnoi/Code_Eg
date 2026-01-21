package programs.oops;

import java.util.Random;
import java.util.Scanner;

class Game{

    private int computerNumber;
    private int numberOfGuesses=0;
    private int usernumber;
    Scanner sc=new Scanner(System.in);
    Random r=new Random();

    public Game()
    {
        computerNumber =r.nextInt(101);

    }
    public int userInput()
    {
        System.out.println("Enter your UserNumber");
         usernumber=sc.nextInt();
        return usernumber;
    }
    public void isCorrect()
    {
        if(usernumber==computerNumber)
        {
            System.out.println("User and Computer guessed same no");

        } else if (usernumber>computerNumber) {
            System.out.println("Enter no less than earlier no");
            userInput();
        }
        else{
            System.out.println("Enter no greator than earlier no");
            userInput();
        }
    }
}
public class OOPS_Num_Game {

    public static void main(String[] args) {
        Game g=new Game();
        g.userInput();
        g.isCorrect();
    }

}

/*
// Create a class game, Which allows a user to play "Guess the Number" game
// once. Game should have the following methods.
// 1. Constructor to generate the random number,
// 2. takeUserInput() to take a user input of number,
// 3. isCorrectNumber to detect whether the number entered by the user is true,
// 4. getter and setter for number of guesses,
// use properties such as noOfGuesses, etc to get this task done!


import java.util.Scanner;
import java.util.Random;

public class Java_exercise_3_guess_the_number {
    public static void main(String[] args) {
        Game myGame=new Game();
        boolean playGame=true;
        int userNumber;

        while(playGame==true) {
            userNumber=myGame.takeUserInput();
            boolean myBool=myGame.isCorrectNumber(userNumber);
            if(myBool==true) {
                System.out.print("Guessed in ");
                myGame.getNumberOfGuesses();
                System.out.print(" Guesses");
                System.out.println("");
                playGame=false;
                break;
            }
            else {
                playGame=true;
            }
        }
    }
}

class Game {
    private int computerNumber;
    private int numberOfGuesses=0;
    Scanner sc=new Scanner(System.in);

    Random rn=new Random();

    public Game() {
        computerNumber=rn.nextInt(101);
    }
    public int takeUserInput() {
        System.out.println("Guess the number (1-100) : ");
        int userNumber=sc.nextInt();
        return userNumber;
    }
    public boolean isCorrectNumber(int myNum) {
        int flag=0;
        if(myNum<=100 && myNum>=0) {
            setNumberOfGuesses();
            if(myNum==computerNumber) {
                System.out.println("You guessed it right. The number is "+myNum);
                flag=1;
                sc.close();
            }
            else if(myNum<computerNumber) {
                System.out.println("Your number is less than the actual number");
            }
            else if(myNum>computerNumber) {
                System.out.println("Your number is greater than the actual number");
            }
        }
        else {
            System.out.println("Please enter in range 0-100");
        }
        if(flag==1) {
            return true;
        }
        else {
            return false;
        }
    }
    public void setNumberOfGuesses() {
        numberOfGuesses++;
    }
    public void getNumberOfGuesses() {
        System.out.print(numberOfGuesses);
    }
}
 */


