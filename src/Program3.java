/*Problem 3:
Write a Java program to rearrange an uppercase version of a string by alternating characters inward from both
ends (1st character, then last character, 2nd character, then 2nd-to-last character, and so on). If the string has an
odd length, append the solitary middle character at the very end.
 */


public class Program3 {
    public static void main(String[] args){
        String str= "Hello";
        String res ="";
        System.out.println("String : "+ str );//Print the String
        for (int i = 0;i<str.length()/2;i++){
            char ch1= str.toUpperCase().charAt(i); // first term w.r.t first term
            char ch2= str.toUpperCase().charAt(str.length()-1-i); // last term w.r.t i
            res = res + ch1+ch2;  //Arrangement logic
        }
        if (str.length() % 2 != 0) {  // Condition to find middle Term if String is Odd
           res = res + str.toUpperCase().charAt(str.length() / 2);
        }
        System.out.println("After Arrangement : " + res);
}
}