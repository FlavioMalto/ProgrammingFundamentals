package Encoding;

import java.util.Scanner;

public class RunLengthEncoding {

    public static String encode(String input){

        //check for null input
        if(input == null || input.length() == 0){
            return "";
        }

        //new StringBuilder instance
        StringBuilder stringBuilder = new StringBuilder();

        //variable declaration
        char[] inputChars = input.toCharArray();
        char prevChar = inputChars[0];
        int counter = 0;

        //iterate over input
        for( char c : inputChars){
            if(c == prevChar){
                counter++;
            }else {
                stringBuilder.append(counter).append(prevChar);
                prevChar = c;
                counter = 1;
            }
        }
        stringBuilder.append(counter).append(prevChar);

        return stringBuilder.toString();

    }

    //another method for run length encoding
    public static String encoding(String text) {
        String encodedString = "";

        for (int i = 0, count = 1; i < text.length(); i++) {
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
                count++;
            else {
                encodedString = encodedString.concat(Integer.toString(count))
                        .concat(Character.toString(text.charAt(i)));
                count = 1;
            }
        }
        return encodedString;
    }

    //test output with main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String uInput;

        System.out.println("Input a string to encode: ");
        uInput = scanner.next();

        String output1 = encode(uInput);

        System.out.println(output1);

        String output2 = encoding(uInput);

        System.out.println(output2);
    }
}
