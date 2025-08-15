import java.util.Scanner;
class Addition{
    int a, b;
    void sum(){
        int sum = a+b;                          //println- nextline, print- keeps printing in the same line
        System.out.println("Sum = " + sum);     //to use + operator- println
        System.out.printf("Sum = %d", sum);     //to use specifiers- printf
    }
}

class Add{
    public static void main(String args[]){
        int x, y;
        Scanner sc = new Scanner(System.in);        //accept input from the keyboard
        System.out.println("Enter two numbers: ");

        x = sc.nextInt();
        y = sc.nextInt();

        Addition obj = new Addition();
        obj.a = x;
        obj.b = y;
        obj.sum();
    }
}