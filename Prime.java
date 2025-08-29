import java.util.Scanner;

class Num{
    int n;
    void checkPrime(){
        int flag = 0;
        for (int i=2; i<= n/2; i++){
            if (n % i == 0){
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println (n + " is a Prime Number.");
        else
            System.out.println(n + " is NOT a Prime Number.");
    }
}

class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        Num obj = new Num();
        obj.n = num;
        obj.checkPrime();
    }
}