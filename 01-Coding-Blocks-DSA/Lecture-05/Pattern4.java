public class Pattern4 {
    public static void main(String[] args){

        int n=5;
        int space=n-1;
        int row=0;
        int star=1;

        while(row<n){
            
            // space
            int i=0;
            while(i<space){
                System.out.print("  ");
                i++;
            }

            // Star
            int j=0;
            while(j<star){
                System.out.print("* ");
                j++;
            }

            // Next line pre..
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
}