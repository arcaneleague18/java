class Airplane{
    String flight_no, destination;
    int departure;
    boolean delay;
    public Airplane(String flight_no, String destination, int departure){
        this.flight_no = flight_no;
        this.destination = destination;
        this.departure = departure;
    }
    public void printDetails(){
        System.out.println("Flight Number: " + flight_no);
        System.out.println("Destination: " + destination);
        System.out.println("Departure time: " + departure);
    }

    public void checkStatus(){
        System.out.println("Status: Not arrived");
    }

    public void delay(){
        System.out.println("Delayed by 2hrs");
    }
}

public class Airplane_details{
    public static void main(String args[]){
        Airplane a = new Airplane("1A76889E","Hyderabad",0100);
        a.printDetails();
        a.checkStatus();
        a.delay();
    }
}