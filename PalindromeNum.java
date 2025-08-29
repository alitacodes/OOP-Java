import java.util.Scanner;

class PalindromeNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter a number: ");
        int num = sc.nextInt();

        int n = num;
        int rev = 0;
        while (n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if (num == rev)
            System.out.println (num + " is Palindrome");
        else
            System.out.println (num + " is NOT Palindrome");
    }
}