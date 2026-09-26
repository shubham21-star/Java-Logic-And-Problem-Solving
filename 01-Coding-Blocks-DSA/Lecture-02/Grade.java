public class grade{

    public static void main(String[] args){

        int n = 300;

      
        if(n>=300 && n<= 460){

            if(n>=300 && n<=380){
                System.out.println("The prize is M1: Macbook.");
            }
            if(n>=380 && n<=460){
                System.out.println("The prize is M2: Macbook.");
            }
            
        }
        else if (n>=200 && n<=280 ){
            
            if(n>=200 && n<=240){
                System.out.println("The prize is 50$: Kurkure.");
            }
            if(n>=240 && n<=280){
                System.out.println("The prize is 100$: Kurkure.");
            }

        }
        else if (n>=1100 && n<=1500 ){
            
            if(n>=1100 && n<=1300){
                System.out.println("The prize is Avon: Cycle.");
            }
            if(n>=380 && n<=460){
                System.out.println("The prize is Hero: Cycle.");
            }

        }
        else if (n>=50 && n<=80){
            
            if(n>=50 && n<=60){
                System.out.println("The prize is Bullet: Bike.");
            }
            if(n>=60 && n<=80){
                System.out.println("The prize is Bullet: Bike.");
            }

        }
        else{
            System.out.println("Better Luck Next Time");
        }

    }
}
