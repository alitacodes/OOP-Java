import java.util.Scanner;
class Min{
    int a, b;
    void findMin(){
        if (a < b)
            System.out.println(a + " is minimum");
        else
            System.out.println(b + " is minimum");
    }
}

class MinNum{
    public static void main(String args[]){
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        Min obj = new Min();
        obj.a = x;
        obj.b = y;
        obj.findMin();
    }
}