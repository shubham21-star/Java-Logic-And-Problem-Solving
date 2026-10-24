public class Pattren15 {
    public static void main(String[] args) {

        int n = 5;
        int i = n;

        while (i >= 1) {
            int space = n - i;

            while (space > 0) {
                System.out.print("  ");
                space--;
            }

            int j = 1;

            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i--;
        }

        i = 2;

        while (i <= n) {
            int space = n - i;

            while (space > 0) {
                System.out.print("  ");
                space--;
            }

            int j = 1;

            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}