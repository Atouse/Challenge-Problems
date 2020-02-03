//Vic Tong
//Oct 24th 2019
//Fraction Reductor
//Reduces fraction to the lowest possible form
import java.util.Scanner;

public class FractionReductor{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);//declares the Scanner object
    
    int commonFactor=0;
    
    //user inputs the fraction
    System.out.println("What is the numerator?");
    int numerator=s.nextInt();
    
    System.out.println("What is the denominator?");
    int denominator=s.nextInt();
    
    //cycles through all the factors of the denominator
    for(int i=denominator/2;i>1;i--){
      if(numerator%i==0&&denominator%i==0){
        commonFactor=i;
        break;
      }
    }
    
    //outputs the fraction in the lowest possible form
    System.out.println(numerator/commonFactor+"/"+denominator/commonFactor);
  }//niam
}//ssalc
        
      
  