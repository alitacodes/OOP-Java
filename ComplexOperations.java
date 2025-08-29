import java.util.Scanner;

class Complex{
    double real;
    double img;

    // Constructor
    Complex(double r, double i) {
        this.real = r;
        this.img = i;
    }

    Complex add(Complex c){     //addition method
        return new Complex(this.real + c.real , this.img + c.img);
    }

    Complex difference(Complex c){
        return new Complex(this.real - c.real , this.img - c.img);
    }

    Complex multiply(Complex c){
        double r = (this.real * c.real) - (this.img * c.img);
        double i = (this.real * c.img) + (this.img * c.real);
        return new Complex(r, i);
    }

    void display(){
        if(img >= 0)
            System.out.println (real + "+" + img + "i");
        else
            System.out.println (real + "-" + (-img) + "i");
    }
}

class ComplexOperations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter for first complex number:-");
        System.out.println("Real Part: ");
        double r1 = sc.nextDouble();
        System.out.println("Imaginary part:");
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter for second complex number:-");
        System.out.println("Real Part: ");
        double r2 = sc.nextDouble();
        System.out.println("Imaginary part:");
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        //to call the methods
        Complex sum = c1.add(c2);
        Complex diff = c1.difference(c2);
        Complex mult = c1.multiply(c2);

        //to display result
        System.out.println ("Sum = ");
        sum.display();

        System.out.println ("Difference = ");
        diff.display();

        System.out.println ("Product = ");
        mult.display();
    }
}