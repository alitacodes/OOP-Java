class Complex{
    double real;
    double img;

    Complex(double real, double img){
        this.real = real;
        this.img = img;
    }
    Complex add(Complex second){
        return new Complex(this.real + second.real, this.img + second.img);
    }
}

class ComplexAdd{
    public static void main(String args[]){
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(10, 20);
        Complex c3;
        c3 = c2.add(c1);
        
    }
}