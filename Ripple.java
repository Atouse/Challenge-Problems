//Vic Tong
//Last Modified: Oct 2nd 2019
//Ripple
//It ripples any word that the user inputs 

import java.util.Scanner;//imports the scanner class

public class Ripple{
  public static void main(String args[]){
    
    Scanner s=new Scanner(System.in);//declares the Scanner object
    String again;
    do{
      System.out.println("What word do you want to ripple?");//asks the user for input
      
      String word=s.nextLine();//receives the word from the user
      
      
      for(int i=0;i<=word.length();i++){
        //prints out the word forwards
        System.out.println(word.substring(0,i));
      }//for
      
      for(int i=word.length()-1;i>0;i--){
        //prints out the word backwards
        System.out.println(word.substring(0,i));
      }//for
      
      System.out.println("Do you want to ripple another word?(yes/no)");//asks the user if they want to enter another word
      again=s.nextLine();//takes the user input on whether they want to enter another word
    }while(again.equals("yes"));//while
  }//niam
}//ssalc
                         
    