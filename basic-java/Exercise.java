// import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        // Exercise 1
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Exercise 2
        int x = 15;
        int y = 22;
        int z = 18;
        int venti;

        if (x > y && x > z) {
            venti = x;
        } else if (y > x && y > z) {
            venti = y;
        } else {
            venti = z;
        }

        System.out.println("Venti number: " + venti);
    }
}
