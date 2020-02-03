//Vic Tong
//Last Modified: Oct 3rd 2019
//Rock Paper Scissors Modified
//Plays a game of rock papers scissors with a twist
import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    String enter="";
    int user,comp,temp;
    do{
      user=(int)(Math.random()*3);
      comp=(int)(Math.random()*3);
      
      output(user,comp);
      
      if(user==comp){
        temp=user;
        
        while(user==temp&&comp==temp){
          user=(int)(Math.random()*3);
          comp=(int)(Math.random()*3);
        }//while
        
        output(user,comp);
        
        if(user==comp)
          System.out.println("It's a tie");
        else if((user-comp)==1||(user-comp)==-2)
          System.out.println("User won");
        else
          System.out.println("Comp won");
      }
      else if((user-comp)==1||(user-comp)==-2)
        System.out.println("User won");
      else
        System.out.println("Comp won");
        
      
        
      enter=s.nextLine();
    }while(enter.equals(""));
  }//niam
  
  public static void output(int user,int comp){
    if(user==0)
      System.out.println("User - Rock");
    else if(user==1)
      System.out.println("User - Paper");
    else
      System.out.println("User - Scissors");
    
    if(comp==0)
      System.out.println("Comp - Rock");
    else if(comp==1)
      System.out.println("Comp - Paper");
    else
      System.out.println("Comp - Scissors");
  }//output method end
    
}//ssalc
    
    