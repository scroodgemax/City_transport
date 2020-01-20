import java.util.*;

public class main {
    public static void main (String[] args){
        Depo depo = new Depo();
        Scanner scanner = new Scanner(System.in);

        int m = 1;
        while (m!=0){
            System.out.println("Enter 1 if you want to create a route or 0 to quit");
            m = scanner.nextInt();
            if (m==1){
               depo.createRoute();

            }
        }
        int tr = 1;
        while (tr!=0){
            System.out.println("Enter 1 if you want to add transport to the route or 0 to quit");
            tr = scanner.nextInt();
            if (tr==1){
                depo.addTransportOnRoute();

            }
        }

    }
}
