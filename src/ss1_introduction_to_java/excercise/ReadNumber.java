package ss1_introduction_to_java.excercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        String result = "";
        String resultTens = "";
        String resultOnes = "";
        String resultHundred = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
        } while (number < 0 || number > 999);
        if (number < 10) {
            switch (number) {
                case 0:
                    result = "Zero";
                    break;
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";


            }
            System.out.print(result);
        } else if (number < 21) {
            switch (number) {
                case 10:
                    result = "Ten";
                    break;
                case 11:
                    result = "Eleven";
                    break;
                case 12:
                    result = "Twelve";
                    break;
                case 13:
                    result = "Thirteen";
                    break;
                case 14:
                    result = "Fourteen";
                    break;
                case 15:
                    result = "Fifteen";
                    break;
                case 16:
                    result = "Sixteen";
                    break;
                case 17:
                    result = "Seventeen";
                    break;
                case 18:
                    result = "Eighteen";
                    break;
                case 19:
                    result = "Nineteen";
                    break;
                case 20:
                    result = "Twenty";
            }
            System.out.print(result);
        } else if (number < 100) {
            switch (number / 10) {
                case 2:
                    resultTens = "Twenty";
                    break;
                case 3:
                    resultTens = "Thirty";
                    break;
                case 4:
                    resultTens = "Forty";
                    break;
                case 5:
                    resultTens = "Fifty";
                    break;
                case 6:
                    resultTens = "sixty";
                    break;
                case 7:
                    resultTens = "Seventy";
                    break;
                case 8:
                    resultTens = "Eighty";
                    break;
                case 9:
                    resultTens = "Ninety";
            }
            switch (number % 10) {
                case 1:
                    resultOnes = "One";
                    break;
                case 2:
                    resultOnes = "Two";
                    break;
                case 3:
                    resultOnes = "Three";
                    break;
                case 4:
                    resultOnes = "Four";
                    break;
                case 5:
                    resultOnes = "Five";
                    break;
                case 6:
                    resultOnes = "Six";
                    break;
                case 7:
                    resultOnes = "Seven";
                    break;
                case 8:
                    resultOnes = "Eight";
                    break;
                case 9:
                    resultOnes = "Nine";
            }
            System.out.printf("%s %s", resultTens, resultOnes);
        } else {
            switch (number / 100) {
                case 1:
                    resultHundred = "One";
                    break;
                case 2:
                    resultHundred = "Two";
                    break;
                case 3:
                    resultHundred = "Three";
                    break;
                case 4:
                    resultHundred = "Four";
                    break;
                case 5:
                    resultHundred = "Five";
                    break;
                case 6:
                    resultHundred = "Six";
                    break;
                case 7:
                    resultHundred = "Seven";
                    break;
                case 8:
                    resultHundred = "Eight";
                    break;
                case 9:
                    resultHundred = "Nine";
            }
            switch ((number % 100) / 10) {
                case 0:
                case 1:
                    resultTens = "";
                    break;
                case 2:
                    resultTens = "and Twenty";
                    break;
                case 3:
                    resultTens = "and Thirty";
                    break;
                case 4:
                    resultTens = "and Forty";
                    break;
                case 5:
                    resultTens = "and Fifty";
                    break;
                case 6:
                    resultTens = "and sixty";
                    break;
                case 7:
                    resultTens = "and Seventy";
                    break;
                case 8:
                    resultTens = "and Eighty";
                    break;
                case 9:
                    resultTens = "and Ninety";
            }
            if ((number % 100) / 10 != 1) {
                switch ((number % 100) % 10) {
                    case 1:
                        resultOnes = "One";
                        break;
                    case 2:
                        resultOnes = "Two";
                        break;
                    case 3:
                        resultOnes = "Three";
                        break;
                    case 4:
                        resultOnes = "Four";
                        break;
                    case 5:
                        resultOnes = "Five";
                        break;
                    case 6:
                        resultOnes = "Six";
                        break;
                    case 7:
                        resultOnes = "Seven";
                        break;
                    case 8:
                        resultOnes = "Eight";
                        break;
                    case 9:
                        resultOnes = "Nine";
                }

            }
            if ((number % 100) / 10 == 1) {
                switch ((number % 100) % 10) {
                    case 0:
                        resultOnes = "and Ten";
                        break;
                    case 1:
                        resultOnes = "and Eleven";
                        break;
                    case 2:
                        resultOnes = "and Twelve";
                        break;
                    case 3:
                        resultOnes = "and Thirteen";
                        break;
                    case 4:
                        resultOnes = "and Fourteen";
                        break;
                    case 5:
                        resultOnes = "and Fifteen";
                        break;
                    case 6:
                        resultOnes = "and Sixteen";
                        break;
                    case 7:
                        resultOnes = "and Seventeen";
                        break;
                    case 8:
                        resultOnes = "and Eighteen";
                        break;
                    case 9:
                        resultOnes = "and Nineteen";
                }

            }
            if ((number % 100) / 10 == 0) {
                switch ((number % 100) % 10) {
                    case 1:
                        resultOnes = "and One";
                        break;
                    case 2:
                        resultOnes = "and Two";
                        break;
                    case 3:
                        resultOnes = "and Three";
                        break;
                    case 4:
                        resultOnes = "and Four";
                        break;
                    case 5:
                        resultOnes = "and Five";
                        break;
                    case 6:
                        resultOnes = "and Six";
                        break;
                    case 7:
                        resultOnes = "and Seven";
                        break;
                    case 8:
                        resultOnes = "and Eight";
                        break;
                    case 9:
                        resultOnes = "and Nine";
                }

            }
            System.out.printf("%s Hundred%s %s", resultHundred, resultTens, resultOnes);
        }
    }}

