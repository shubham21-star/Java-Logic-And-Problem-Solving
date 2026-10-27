public class pattern13 {
    public static void main(String[] args){
        int n =5,space =n-1,star=1;
        int row =0;
        while(row<n){
            int i =0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            int j =0;
            while(j<star){
                if(j%2==0){
                System.out.print("*");}
                else{
                    System.out.print("!");
                }
                j++;
            }
            System.err.println();
            row++;
            star +=2;
            space--;
        }
    }
}