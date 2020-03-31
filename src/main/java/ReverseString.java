import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        List<String> reverseList = new ArrayList<>();

        while(scanner.hasNextLine()){
            inputList.add(scanner.nextLine());
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
