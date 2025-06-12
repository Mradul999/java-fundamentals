import java.util.Scanner;
public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int eachGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + eachGets + " and the number of remaining chocolates is " + remaining);
    }
}
