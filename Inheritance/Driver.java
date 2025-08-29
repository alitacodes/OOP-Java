class Rectangle {
    double length, width;
    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return (length * width);
    }
}

class Cuboid extends Rectangle {        // extends - properties of rectangle inherited
    double height;
    Cuboid (double length, double width, double height) {
        super (length, width);
        this.height = height;
    }

    double volume() {
        return (length * width * height);
    }
}

class Driver {
    public static void main(String args[]) {
        Cuboid cub1 = new Cuboid (5, 10, 20);
        System.out.println (cub1.area());
        System.out.println (cub1.volume());
        System.out.println (cub1.width);

        // Rectangle r = new Rectangle (5, 6);
        // System.out.println (r.height);
            // GIVES ERROR ,, AS PARENT CLASS CAN'T ACCESS VARIABLES & METHODS FROM CHILD CLASS

            // CHILD CLASS INHERITS PROPERTIES OF PARENT CLASS, SO CHILD CLASS CAN ACCESS VARIABLES & METHODS OF PARENT CLASS
    }
}