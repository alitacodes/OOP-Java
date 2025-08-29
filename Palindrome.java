import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        
        String input = sc.nextLine();   
        StringBuffer str = new StringBuffer(input);
        
        String temp = input;           
        if (temp.equalsIgnoreCase(str.reverse().toString())) {  
            System.out.println(temp + " is Palindrome.");
        } else {
            System.out.println(temp + " is not Palindrome.");
        }
    }
}
