import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int x4 = in.nextInt();

        System.out.println(min(x1,x2,x3,x4));

    }

    private static int min(int x1, int x2, int x3, int x4) {
   return Math.min(Math.min(x1,x2),Math.min(x3,x4));
    }

    public static int Sum(int x) {

        int count=0;
        for (int i = 100; i < 1000; i++) {
            int s = 0;
            if (i < x) {
                int n = i;
                while (n != 0) {
                    s = s + n % 10;
                    n = n / 10;
                }
                if (s % 13 == 0)
                    count++;
            }
        }
        return count;
    }
}
       /* Point point = new Point();
        Point[] points = new Point[10];
        Point[] points2 = new Point[100];

        // System.out.println("Привет, Мир!");//Ctrl + Shift + F10

        InputMass(points, 10, 20);
        OutputMass(points);
        InputMass(points2, 10, 20);
        OutputMass(points2);


        String name = in.next();
        print("Hello, " + name);
        int[] array = new int[10];
        int[] array2 = new int[10];
        int A, B;
        A = in.nextInt();
        B = in.nextInt();
        //array [50,150]
        InputMass(array, A, B);
        OutputMass(array);
        int max = MaxArray(array);
        System.out.println("Max = " + max);
        System.out.println("Min = " + MinArray(array));


        InputMass(array2, -10, 10);
        OutputMass(array2);
        System.out.println("Max = " + MaxArray(array2));
        System.out.println("Min = " + MinArray(array2));

        point.setX(100);
        point.setY(200);
        System.out.println(point);


    }

    private static int MaxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    private static int MinArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    private static void OutputMass(Point[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("\n==========================\n");
    }

    private static void OutputMass(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n==========================\n");
    }

    private static void print(String s) {//
        System.out.println(s);
    }

    public static void InputMass(int[] array, int A, int B) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (A + Math.random() * (B - A + 1));
        }
    }

    public static void InputMass(Point[] array, int A, int B) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Point((int) (A + Math.random() * (B - A + 1)), (int) (A + Math.random() * (B - A + 1)));
        }
    }
    }
*/

