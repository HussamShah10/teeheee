//imports thing for input
import java.util.Scanner;


    


class Main {
    public static void main(String[] args) {
        //calls function
        asnwer();
       }
      
        //function for the whole thing
        public static void asnwer(){
        
        //everything to get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        
        //validation to see if its a numbebr or not
        try{
            int num = scanner.nextInt();
        
        //gets the number typed and counts down from it until it hits 1.
        for (int i = num - 1; i > 0; i--){
            System.out.println(i);
            
            
        }
            
        }
        //printed when anything but a number is typed
        catch(Exception e){
            System.out.println("not a num");
        }}
        
    
        
    }
