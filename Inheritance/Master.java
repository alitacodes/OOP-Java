class A {
    int x;
    A (int x){
        this.x = x;
    }
}

class B extends A {
    int y;
    B(int x, int y){
        super(x);
        this.y = y;
    }
}

class C extends B {
    int z;
    C (int x, int y, int z) {
        super (x, y);
        this.z = z;
    }
}

// class C extends A {
//     int z;
//     C (int x, int z){
//         super (x);
//         this.z = z;
//     }
// }

class Master {
    public static void main(String args[]){
        B b = new B (5, 6);
        C c = new C (7, 8, 9);
        System.out.println (b.x);       // 5
        // System.out.println (b.z);        GIVES ERROR
        System.out.println (c.z);       // 9
        System.out.println (c.x);       // 7
    }
}