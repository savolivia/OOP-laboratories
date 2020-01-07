package Laboratory_4;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception
    {

        File text= new File("C:\\Users\\olivica\\Desktop\\expressions\\one_expression.txt");
        Scanner sc = new Scanner(text);
        System.out.println("The expressions from text file are:");
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String inputWithoutSpaces = input.replaceAll("\\s+","");
            System.out.println("\n");
            System.out.println(input);
            if (CheckParanthesis.verifyParenthesis(inputWithoutSpaces)) {
                System.out.println("The paranthesis are put correct in the expression");
            }
            else {
                System.out.println("The paracthesis are not put correct in the expression");
            }
        }
        sc.close();
    }
}
