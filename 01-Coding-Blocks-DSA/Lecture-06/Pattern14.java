public class Patterm14 {
    public static void main(String[] args) {

        int n = 5;
        int i = 1;

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

        i = n - 1;

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
    }
}