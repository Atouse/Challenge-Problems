//Vic Tong
//Dec 17th 2019
//Slot Machine
//Plays a game of slots 
import java.util.Scanner;
import java.lang.Math;
public class SlotMachine{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);//declares the Scanner object
    
    int [] slots=new int[3];//declares the slot variables
    String again;//declares the input for roll the slots again
    do{
      for(int i=0;i<3;i++){
        slots[i]=(int)(Math.random()*7)+1;//generates the random numbers
        System.out.print(slots[i]+" ");//prints out the random number
      }//for
      if(jackpot(slots[0],slots[1],slots[2]))//checks if it's a jackpot
        System.out.println("JACKPOT!!!");
      else if(birdie(slots[0],slots[1],slots[2]))//checks if it's a birdie
        System.out.println("Birdie");
      else//anything else is a dud
        System.out.println("Dud");
      again=s.nextLine();//accepts the user input to go again
    }while(again.equals(""));
  }//niam
  
  public static boolean birdie(int x, int y, int z){
    if(x==y||x==z)
      return true;
    else if(y==z)
      return true;
    
    return false;
  }//birdie method
  
  public static boolean jackpot(int x, int y, int z){
    if(x==y&&x==z)
      return true;
    
    return false;
  }//jackpot method
}//ssalc
      
      
    