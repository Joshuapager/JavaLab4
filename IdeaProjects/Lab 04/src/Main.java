import java.util.Scanner;

public class Main {

    public static void hexNoX(String hexNum, int lengthHex) {
        int y = 0;
        char let2;
        int num1;
        long sumOfHex = 0;
        while (y < lengthHex) {
            let2 = hexNum.charAt(y);

            if (Character.isLetter(let2)) {
                let2 = Character.toUpperCase(hexNum.charAt(y));
                num1 = ((int)let2) - 55;
            } else {
                num1 = ((int)let2) - 48;
            }
            sumOfHex += (num1 * Math.pow(16, (lengthHex - 1 - y)));
            y++;
        }
        System.out.println("Your number is " + sumOfHex + " in decimal");
    }
    public static void hexWithX (String hexnumber, int hexLength) {

        hexLength = hexLength - 2;
        int x = 0, num;
        char let3;
        long hexsum = 0;

        while (x < hexLength) {
            let3 = hexnumber.charAt(x + 2);

            if (Character.isLetter(let3)) {
                let3 = Character.toUpperCase(let3);
                num = ((int)let3) - 55;
            } else {
                num = ((int)let3) - 48;
            }
            hexsum += (num * Math.pow(16, (hexLength - 1 - x)));
            x++;
        }
        System.out.println("Your number is " + hexsum + " in decimal");
    }

    public static void main(String args[]) {

            Scanner scnr = new Scanner(System.in);

            String userInput;

            System.out.print("Enter a hexadecimal number: ");
            userInput = scnr.nextLine();
            int length = userInput.length();


            if (userInput.charAt(1) == 'x') {
                hexWithX(userInput, length);
            } else {
                hexNoX(userInput, length);

            }




    }
    }
