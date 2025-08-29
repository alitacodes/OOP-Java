import java.util.Scanner;
class Car{
    float u, a, t;
    void vel(){
        float v = u + (a * t);
        System.out.println ("Velocity of the car = " + v);
    }
}

class Velocity{
    public static void main(String args[]){
        float x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial velocity of car: ");
        x = sc.nextFloat();

        System.out.println("Enter acceleration of car: ");
        y = sc.nextFloat();

        System.out.println("Enter the time taken: ");
        z = sc.nextFloat();

        Car obj = new Car();
        obj.u = x;
        obj.a = y;
        obj.t = z;
        obj.vel();
    }
}