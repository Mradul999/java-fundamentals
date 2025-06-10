import java.util.*;

public class DayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int add_function = add(a, b);

        System.out.println(add_function);

    }

    public static int add(int a, int b) {

        return a + b;

    }

}