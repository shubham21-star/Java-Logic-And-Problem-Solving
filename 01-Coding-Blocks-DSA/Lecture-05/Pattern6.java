public class Pattern4 {
    public static void main(String[] args){

        int n=5;
        int space=0;
        int row=0;
        int star=5;

        while(row<n){
            
            // space
            int i=0;
            while(i<space){
                System.out.print("  ");
                i+=1;
                
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
            space++;
            star--;
            
        }
    }
}