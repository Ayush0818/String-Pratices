public class Program1 {
    public static void main(String[] args){
        String str= "Hello";

        for (int i = 0;i<str.length();i++){
            char ch= str.toUpperCase().charAt(i);

            int AsciiVal= (int) ch;    //Casting the character to an integer to get its ASCII value
            System.out.println("String : "+ ch + "\nASCII Values :"+AsciiVal);
        }
    }
}
