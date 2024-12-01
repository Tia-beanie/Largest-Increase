import java.util.Scanner;
public class LargestIncrease {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
     
        int num1, num2, max = 0;
        
        num1 = scan.nextInt();
        
        do{
            num2 = scan.nextInt();

            if(num2 == -1)  
                break;

            if((num2 - num1) >  max){
                max = num2 - num1;
            }
            
            num1 = num2;

        }while(num1 != -1 && num2 != -1);

        System.out.println("The largest increase observed: " + max);
    }
    
}
