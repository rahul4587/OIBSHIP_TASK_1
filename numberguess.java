import java.util.*;

public class numberguess {
    public static void main(String[] args) {

        int ans, guess, guessNum = 0;
        final int maxGuesses =5;
        String str, pAgain = "y";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        ans = generator.nextInt(100) + 1;
        int counter = 0;

        while (pAgain.equals("y") || pAgain.equals("Y")) {
            System.out.println("Hey You Are Welcome To The Game :)\nGuess A Number Between 1 to 100 :-->");
            System.out.println("Guess A Number [0 to quit]:");

            guess = scan.nextInt();
            guessNum = 0;
            while (guess != 0)
            {
                guessNum++;
                if (guess == ans) {
                    System.out.println("Perfect! You Are Right !!!");
                    System.out.println("Your Score : " + (100 - counter));
                    break;
                } else if (guess < ans)
                {
                    System.out.println("Oppssss!!! Your Guess Was Too LOW, Try Some Higher Numbers .......");
                    counter++;
                }
                    
                else if (guess > ans)
                {
                    System.out.println("Oppssss!!! Your Guess Was Too HIGH, Try Some Lower Numbers .......");
                    counter++;
                }
                    
                if (guessNum == maxGuesses) {
                    System.out.println("The Number Was : " + ans +"\nBetter Luck Next Time :)");
                    break;
                }
                System.out.println("Enter your guess [0 to Quit]:");
                guess = scan.nextInt();
            }
            System.out.println("Want To Play Again?(y/n)");
            pAgain = scan.next();
            
        }
        System.out.println("Thanks For Playing With Me !!!!");
        System.out.println("Seeeeeee Youuuuuuu Againnnnnnn !!!!!!!!!!!!");
    }
}
