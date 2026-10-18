/*Problem 1:
Write a Java program that takes an input string, converts each character into uppercase, and outputs each character
alongside its corresponding numerical ASCII code. */


public class Program1 {
    public static void main(String[] args){
        String str= "Hello";

        for (int i = 0;i<str.length();i++){
            char ch= str.toUpperCase().charAt(i);

            int AsciiVal= (int) ch;    //Casting the character to an integer to get its ASCII value
            System.out.println("String : "+ ch + "\nASCII Values :"+AsciiVal); //Print the Ascii values
        }
    }
}
