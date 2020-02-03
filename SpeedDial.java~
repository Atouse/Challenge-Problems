//Vic Tong
//Last Modified: Oct 15th 2019
//Speed Dial
//Allows the user to store or change or call phone numbers assigned to buttons
import java.util.Scanner;

public class SpeedDial{
  //declaring the global variables
  static String [] phoneBook=new String[]{"a","a","a","a","a","a","a","a","a","a"};
  static Scanner s=new Scanner(System.in);
  
  public static void main(String args[]){
    //declares the choice variable which keeps track of the users input
    int choice;
    //declares the again variable which is used if the user wants to go back to the main menu
    char again;
    
    do{
      //prints out the main menu
      System.out.println("Menu:");
      System.out.println("1 - Enter a phone number");
      System.out.println("2 - Dial a phone number");
      System.out.println("3 - Change a phone number");
      System.out.println("4 - Exit");
      
      //receives the input from user
      choice=check(1,4);
      
      //performs the action depending on the input
      if(choice==1||choice==3){//stores or change the number in the button
        System.out.println("What button would you like to store?(0-9)");
        
        choice=check(0,9);
        
        System.out.println("Enter the phone number");
        phoneBook[choice]=s.nextLine();
      }
      else if(choice==2){//dials the number based on user input
        System.out.println("What phone number would you like to dial?");
        choice=check(0,9);
        if(phoneBook[choice].equals("a"))
          System.out.println("There is no phone number in this button");
        else
          System.out.println("Dialing "+phoneBook[choice]);
      }
      else{//Exits the main menu
        System.out.println("Goodbye");
        break;
      }
      
      //asks the user if they want to return to the main menu
      System.out.println("Type 'y' to return to the main menu, otherwise type anything else");
      
      again=s.nextLine().charAt(0);
      
    }while(again=='y');
    
  }//niam
  public static int check(int min, int max){
    //Checks whether the input is valid within the specified parameters
    int choice=-2;
    do{
      try{
        phoneBook[0]=s.nextLine();
        choice=Integer.parseInt(phoneBook[0]);
      }
      catch(NumberFormatException e){
        
      }
      if(choice>=min&&choice<=max)
        break;
      else
        System.out.println("That's not valid");
    }while(true);
    
    return choice;
  }//check method
    
}//ssalc