public class Program2 {
    public static void main(String[] args){
        String str= "Hello";

        for (int i = 0;i<str.length();i++){
            char ch= str.toUpperCase().charAt(i);

            int AsciiVal= (int) ch; //Casting the character to an integer to get its ASCII value

            int alphabetorder= AsciiVal-64; // Alphabetical order = ASCII Valie- 64 (for uppercase only)

            System.out.println("String : "+ ch + "\nAalphabetical order :"+alphabetorder); //Print the order
        }
    }
}
