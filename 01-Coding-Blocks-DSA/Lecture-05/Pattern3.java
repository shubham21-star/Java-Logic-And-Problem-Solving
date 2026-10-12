public class Pattern3 {
    public static void main(String[] args){

        int n=5;
        int row=0;
        int star=5;

        while(row<n){
            
            // star print
            int col=0;
            while(col<star){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row++;
            star--;
            
        }
    }
}