//Vic Tong
//Nov 19th 2019
//A Ray Manipulator
//Manipulates a char array to add or remove letters
import java.util.Scanner;

public class ARayManipulator{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    
    char[] list=new char[0];
    
    while(true){
      //gets the letter
      System.out.println("\nEnter a letter");
      char letter=s.nextLine().charAt(0);

      //if the letter is already in the array it would remove it
      if(lookFor(list,letter))
        list=remove(list,letter);
      //if the letter isn't in the array it would add it
      else
        list=add(list,letter);
      
      //prints out the array 
      System.out.print("The array contains: ");
      
      for(int i=0;i<list.length;i++){
        System.out.print(list[i]+"  ");
      }
    }
    
    
  }
  public static char[] add(char[] array, char addition){
    char[] copy=new char[array.length+1];
    for(int i=0;i<copy.length;i++){
      if(i!=copy.length-1)
        copy[i]=array[i];
      else
        copy[i]=addition;
    }//for
    return copy;
  }//add method
  
  public static boolean lookFor(char[] array, char key){
    for(int i=0;i<array.length;i++){
      if(array[i]==key)
        return true;
    }
    return false;
  }//lookFor method
  
  public static char[] remove(char[] array, char subtraction){
    char[]copy=new char[array.length];
    for(int i=0;i<copy.length;i++){
      if(subtraction!=array[i])
        copy[i]=array[i];
    }//for
    
    return copy;
  }//remove method
}//ssalc