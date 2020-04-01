import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessStrings {

    public static void main(String[] args){
        List<String> stringsToReverse = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        stringsToReverse.add("I love baseball");
        stringsToReverse.add("Football is great");
        stringsToReverse.add("Soccer is ok");
        stringsToReverse.add("How much wood could a woodchuck chuck");
        printReverseString(stringsToReverse);

        printReverseString(scanner);

    }

    private static void printReverseString(@NotNull List<String> inputList) {
//        Scanner scanner = new Scanner(System.in); //used to get user input
        List<String> reverseList = new ArrayList<>();

//        while(scanner.hasNextLine()){
//            inputList.add(scanner.nextLine());
//        }

        for(String line : inputList){
            StringBuilder reversedLine = new StringBuilder();
            for(int i = line.length()-1; i > -1; i--){
                reversedLine.append(line.charAt(i));
            }
            reverseList.add(reversedLine.toString());
        }

        for(String line : reverseList){
            System.out.println(line);
        }
    }

    /**
     * Takes user input to reverse a string
     * @param inputScanner
     */
    private static void printReverseString(Scanner inputScanner){
        int numberOfElements = 0;
        List<String> inputList = new ArrayList<>();
        List<String> reverseList = new ArrayList<>();

        System.out.println("Please enter the number of lines to be reversed: ");

        while(!inputScanner.hasNextInt()){
            System.out.println("Please enter an integer value for the number of elements in the list!");
            inputScanner.next();
        }

        numberOfElements = inputScanner.nextInt();

        for(int i = 0; i < numberOfElements+1; i++){

            inputList.add(inputScanner.nextLine());
        }

        for(String line : inputList){
            StringBuilder reversedLine = new StringBuilder();
            for(int i = line.length()-1; i > -1; i--){
                reversedLine.append(line.charAt(i));
            }
            reverseList.add(reversedLine.toString());
        }

        for(String line : reverseList){
            System.out.println(line);
        }
    }
}
