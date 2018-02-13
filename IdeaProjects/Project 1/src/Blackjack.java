import java.util.Scanner;


public class Blackjack {
    public static void main(String args[]) {
        int playGame = 0;

        P1Random rng = new P1Random();
        // int myValue = rng.nextInt(11) + 16; //Dealer"s hand
        int numGame = 1;
        int ACE = 1;
        int JACK = 11;
        int QUEEN = 12;
        //int KING = 13;
       // int myNumber = rng.nextInt(13) + 1; //Player's hand
        // int startGame = 0;
        int numWins = 0;
        int numLosses = 0;
        int numTies = 0;
        int numTotal = 1;  // find out how to input total # games
        Scanner scnr = new Scanner(System.in);
        while (playGame == 0) {
            //P1Random rng = new P1Random();
            int myNumber1 = rng.nextInt(13) + 1; //Player's hand
            int myValue = rng.nextInt(11) + 16; //Dealer"s hand

                    System.out.println("Start Game #: " + numGame);
                    numGame++;
                    System.out.println("");
                    System.out.println("Your card is a " + myNumber1);
                    System.out.println("Your hand is a: " + myNumber1);
                    System.out.println("");
                    System.out.println("1. Get another card.");
                    System.out.println("2. Hold Hand");
                    System.out.println("3. Print Statistics");
                    System.out.println("4. Exit");
                    System.out.println("");





                {
                    System.out.print("Choose an option: ");
                    int pickOption = scnr.nextInt();
                    if (pickOption == 1) {
                        myNumber1 = rng.nextInt(13) + 1;
                        if (myNumber1 == 13)
                        {
                           String KING = String.valueOf(myNumber1);
                        }
                        if (myNumber1 == 12)
                        {
                            System.out.print("QUEEN!");
                        }
                        if (myNumber1 == 11)
                        {
                            System.out.print("JACK!");
                        }
                        if (myNumber1 == 1)
                        {
                            System.out.print("ACE!");
                        }
                        System.out.println("Your card is a " + myNumber1);
                        int myHand = myNumber1;
                        System.out.println("Your hand is " + myHand);
                        System.out.println("");

                        if (myHand < 21) {
                            System.out.println("1. Get another card.");
                            System.out.println("2. Hold Hand");
                            System.out.println("3. Print Statistics");
                            System.out.println("4. Exit");
                            System.out.println("Chose an option: "); //put all possible print outputs of option 1 in if-else under pickOption1
                        } else if (myHand == 21) {
                            System.out.println("BLACKJACK! You win!");
                            numWins += 1;
                        } else {
                            System.out.println("You exceeded 21, you lose!");
                            numLosses += 1;
                        }
                    } else if (pickOption == 2) {
                        if (myValue <= 21) {
                            System.out.println("Dealer's hand: " + myValue);
                            System.out.println("Your hand: " + myNumber1);
                            if (myNumber1 > myValue) {
                                System.out.println("You win!");
                                numWins += 1;

                            } else if (myNumber1 < myValue) {
                                System.out.println("You lose!");
                                numLosses += 1;

                            } else {
                                System.out.println("It's a tie! No one wins!");
                                numTies += 1;

                            }
                        } else {
                            System.out.println("You exceeded 21! You lose!");
                            numLosses += 1;

                        }

                    } else if (pickOption == 3) {
                        System.out.println("Number of Player wins: " + numWins);
                        System.out.println("Number of Dealer wins: " + numLosses);
                        System.out.println("Number of tie games: " + numTies);
                        System.out.println("Total # of games played is: " + numTotal);
                        double percentWins = ((double) (numLosses)) / numTotal * 100; //this equation works
                        System.out.println("Percentage of player wins: " + percentWins + "%");
                    } else if (pickOption == 4) {
                        System.exit(0);
                    } else {
                        System.out.println("INVALID INPUT!");
                        System.out.println("Please enter an integer value between 1 and 4.");
                    }}
                }

        }
    }







