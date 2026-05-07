package StarPatterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print("0");

            for (int j = i; j < 2 * i; j++)
                System.out.print(j);

            for (int j = 2 * i - 2; j >= i; j--)
                System.out.print(j);

            for (int s = 1; s <= n - i; s++)
                System.out.print("0");

            System.out.println();
        }
    }
}