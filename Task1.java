import java.util.Random;
import java.util.Scanner;
 
 public class Task1 {

    
    public static void main(String[] args){
        
        Task1 j = new Task1();
        int nbr,i,humangues,pcgues,k,u=1 ;
        Random tmp = new Random();
        nbr = tmp.nextInt(100)+1;
        System.out.println("Round 1 ");
        u = 1;
        i = j.saisirnbr();
          humangues = pcgues = 0;
        for(int r = 0 ; r < 3 ; r++){   
            System.out.println(nbr);
             k = 0;            
             while ((nbr != i) && k != 4){

            if(i < nbr) {
            System.out.println("Your guess is too low.");
            i = j.saisirnbr();
            
            }
            else {

                System.out.println("Your guess is too hight.");
                i = j.saisirnbr();
            }
            k++;
           }
                
    
            if(i == nbr){
            System.out.println("Congratulations, You Won the round!!");
            humangues++;
            }else {
                System.out.println("Lost the Round " + (r+1) +", The Nombre is " +nbr);
                pcgues++;
            }
            nbr = tmp.nextInt(100)+1;
            if(r < 2) System.out.println("Round " +(++u));
        
        }
            if(humangues > pcgues) {
            System.out.println("Congratulations, You won The Game ");
            System.out.println("Your Score "+humangues+"/3" );
            }else {
                System.out.println("Game over !! You loat The Game");
            }
        

    }

    public int saisirnbr (){

        Scanner img = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int c = img.nextInt(); 

        return c;
    }

}
 