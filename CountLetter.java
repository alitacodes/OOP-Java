import java.util.Scanner;
class CountLetter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter a string: ");
        String str = sc.nextLine();
        
        int[] count = new int[26];

        for (int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                count[ch - 'a']++ ;
            }
        }

        for (int i=0; i<26; i++){
            if (count[i] > 0){
                System.out.println((char) (i + 'a') + " : " + count[i]);
            }
        }
    }
}