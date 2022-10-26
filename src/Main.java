import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Point {
    int x;
    int y;

    Point() {
        x = 5;
    }
}


public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int b[];
        b = new int[3];
        a[0] = 10;
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length- 1]);
//        a = {1, 2, 4};

        int table[][] = new int[3][4];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                table[r][c] = r + c;
            }
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < table[r].length; c++) {
                System.out.print(table[r][c]);
                System.out.print(' ');
            }
            System.out.println();
        }

        int[][] stepped = new int[3][];
        stepped[0] = new int[1];
        stepped[1] = new int[2];
        stepped[2] = new int[3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        for (int j : a) {
            System.out.println(j);
        }

        for (int[] ss : arr) {
            ss[0] = -1;
            System.out.println(ss.length);
        }
        for (int[] ss : arr) {
            for (int i: ss) {
                System.out.println(i);
            }
        }

        String s1 = "qqq";
        String s2 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        s1 = toUpper(s1);
        System.out.println(s1);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        String line = scanner.nextLine();
        String[] lineArray = line.split(" ");
        int[] intArr = new int[lineArray.length];
        for(int i = 0; i < lineArray.length; i++){
            intArr[i] = Integer.parseInt(lineArray[i]);
        }

    }

    static String toUpper(String s){
        return s.toUpperCase();
    }
}