import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        System.out.println("The total miles is " + (km / 1.6) + " mile for the given " + km + " km");
    }
}
