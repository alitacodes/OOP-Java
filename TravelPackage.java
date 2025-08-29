import java.util.Scanner;
class TravelPackage {

    String TCode;
    int NoofAdults , NoofKids, Kilometers;
    float TotalFare;

    TravelPackage(){
        TCode = null;
        NoofAdults = 0;
        NoofKids = 0; 
        Kilometers = 0;
        TotalFare = 0.0f;
    }

    float AssignFare(){
        if (Kilometers >= 1000){
            TotalFare = NoofAdults * 500 + NoofKids * 250;
        }
        else if (Kilometers < 1000 && Kilometers >= 500){
            TotalFare = NoofAdults * 300 + NoofKids * 150;
        }
        else if (Kilometers < 500){
            TotalFare = NoofAdults * 200 + NoofKids * 100;
        }
        else {
            System.out.println ("Unavailable!");
        }
        return TotalFare;
    }

    void EnterTour(){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Travel Code: ");
        TCode = sc.nextLine();
        System.out.println ("No. of Adults: ");
        NoofAdults = sc.nextInt();
        System.out.println ("No. of Kids: ");
        NoofKids = sc.nextInt();
        System.out.println ("Kilometers: ");
        Kilometers = sc.nextInt();
        TotalFare = AssignFare();
        System.out.println ("Total Fare = " + TotalFare);
    }

    void ShowTour(){
        System.out.println ("\n======DETAILS======");
        System.out.println("Travel Code: " + TCode);
        System.out.println("No. of Adults: " + NoofAdults);
        System.out.println("No. of Kids: " + NoofKids);
        System.out.println("Distance Covered: " + Kilometers);
        System.out.println("Total Fare: " + TotalFare);
    }

    public static void main(String args[]){
        TravelPackage tp = new TravelPackage();
        tp.EnterTour();
        tp.ShowTour();
    }
}