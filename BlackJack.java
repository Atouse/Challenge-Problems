//Vic Tong 
//Black Jack
//Oct 24th 2019
//Plays a simple game of Black Jack with the computer
import java.util.Scanner;
import java.lang.Math;

public class BlackJack{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);//creates the Scanner object
    
    //initializes the needed variables
    String again="";
    int [] comp=new int[3];
    int [] user=new int[3];
    
    do{
      //receives the user input for the enter key
      System.out.println("Press enter to play");
      again=s.nextLine();
      if(!again.equals(""))
        break;
      
      //generates the random cards
      comp[0]=(int)(Math.random()*11)+1;
      comp[1]=(int)(Math.random()*11)+1;
      
      user[0]=(int)(Math.random()*11)+1;
      user[1]=(int)(Math.random()*11)+1;
      
      //stores the value in the third element
      user[2]=user[0]+user[1];
      comp[2]=comp[0]+comp[1];
      System.out.println("User is: "+user[0]+" and "+user[1]+" for a total of "+user[2]);
      System.out.println("Comp is: "+comp[0]+" and "+comp[1]+" for a total of "+comp[2]);
      
      //checks whoever won
      if(user[2]==21)
        System.out.println("User won");
      else if(comp[0]+comp[1]==21)
        System.out.println("Comp won");
      else{
        while(again.equals("")){
          System.out.print("Hit me:");
          again=s.nextLine();
          if(!again.equals(""))
            break;
          user[2]=user[2]+(int)(Math.random()*11)+1;
          System.out.println("Your total is now "+user[2]);
          if(user[2]>21)
            break;
        }
    
        again="";
      }//else
      
      //prints out who won the game
      if(user[2]<21&&user[2]>comp[2])
        System.out.println("User won");
      
      else
        System.out.println("Comp won");
      
    }while(again.equals(""));

  }
}
    