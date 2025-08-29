import java.util.Scanner;
class Points{
    int a1, b1, a2, b2, a3, b3;
    void checkCollinearity(){
        if ((a2-a1 == 0) || (a3-a2 == 0) || (a3-a1 == 0)){      //message to alert if any one of the denominators come zero
            System.out.println ("Invalid Format!\nDifference of one of the denominators is zero");
        }else{
            //slopes of PQ, QR and QR
            int slopePQ = (b2-b1) / (a2-a1);        
            int slopeQR = (b3-b2) / (a3-a2);
            int slopePR = (b3-b1) / (a3-a1);

            //collinearity check
            if (slopePQ == slopeQR && slopeQR == slopePR && slopePR == slopePQ) {
                System.out.println ("Points P, Q and R are collinear");
            }else {
                System.out.println ("Points P, Q and R are NOT collinear");
            }
        }
    }
}

class Collinear{
    public static void main(String args[]){     //main
        int x1, y1, x2, y2, x3, y3;
        Scanner sc = new Scanner(System.in);
        System.out.println("P (x1, y1): ");     //first point coordinates
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("Q (x2, y2): ");     //second point coordinates
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("R (x3, y3): ");     //third point coordinates
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        Points obj = new Points();          //object to the class Points
        obj.a1 = x1;
        obj.b1 = y1;
        obj.a2 = x2;
        obj.b2 = y2;
        obj.a3 = x3;
        obj.b3 = y3;
        obj.checkCollinearity();        //method call
    }
}