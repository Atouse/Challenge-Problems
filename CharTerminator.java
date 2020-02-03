//Vic Tong
//Oct 28th 2019
//Char Terminator
//The user enters a word and a string of letter(s) and the program removes them
import java.util.*;

public class CharTerminator{
  public static void main(String []args){
    Scanner s=new Scanner(System.in);//declares the Scanner object
    
    //asks the user to enter a word
    System.out.println("Enter a word");
    String word=s.nextLine();
    
    //stores the word in a StringBuffer object
    StringBuffer copy=new StringBuffer(word);
    
    //asks the user what letter(s) they want to remove
    System.out.println("What letters do you want to remove?");
    String remove=s.nextLine();
    
    //removes the letters by check if they are equal each other
    for(int i=0;i<remove.length();i++){
      for(int j=0;j<word.length();j++){
        if(remove.charAt(i)==word.charAt(j))
          copy.deleteCharAt(j);
      }
    }
    
    //stores the StringBuffer object as a string into word
    word=copy.toString();
    
    //outputs it
    System.out.println(word);
  }//niam
}//ssalc