import java.util.*;

public class Depo {
    private ArrayList<Route>arrayRoute;
    Scanner scanner = new Scanner(System.in);

    public Depo(){
        arrayRoute = new ArrayList<>(5);
    }
        public void setArrayRoute(ArrayList<Route> arrayRoute) {
        this.arrayRoute = arrayRoute;
    }

    public ArrayList<Route> getArrayRoute() {
        return arrayRoute;
    }
    public void createRoute() {
        int numberRoute;
        String startOfRoute;
        String endOfRoute;
        int timeOfRoute;

        System.out.println("Create new route");
        System.out.println("Enter number of route:");
        numberRoute = scanner.nextInt();
        System.out.println("Enter a start of rote:");
        startOfRoute = scanner.next();
        System.out.println("Enter a end of rote:");
        endOfRoute = scanner.next();
        System.out.println("Enter duration of route:");
        timeOfRoute = scanner.nextInt();
        Route route = new Route(numberRoute, startOfRoute, endOfRoute, timeOfRoute);
        arrayRoute.add(route);
        System.out.println("Created new route");
    }
    public void addTransportOnRoute(){
        int numRoute;
        int indexRoute;
        System.out.println("Enter number of route for add transport:");
        numRoute = scanner.nextInt();
      /*  for (int i=0; i<arrayRoute.size(); i++)
        {
            if (getArrayRoute().get(i).getNumberRoute()== numRoute){
               indexRoute = i;
               break;
            } else System.out.println("The route is not found!");
        }
        Route myRoute = getArrayRoute().get(indexRoute); */
        for (var i:arrayRoute
             ) {
            if (i.getNumberRoute()== numRoute){
                i.AddBus();
            }


        }
    }
}
