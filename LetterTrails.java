//Vic Tong
//Last Modified:Nov 8th 2019
//Letter Trails
//prints out the letters till z from the inputted letters
import java.util.*;//imports the necessary files
import java.util.Arrays;
public class LetterTrails{
  public static void main(String []args){
    Scanner s=new Scanner(System.in);//creates the scanner object
    
    //asks the user what letters they want to trail
    System.out.println("What letters do you want to trail?");
    String input=s.nextLine();//accepts the string of letters
    
    input=input.toLowerCase();//converts them all to lowercase as to not interfere with the ASCII values
    
    int [] trail=new int[input.length()];
    char[]letters=input.toCharArray();//turns the string input into a char array 
    char letter;
    
    for(int i=0;i<input.length();i++){
      trail[i]=122-letters[i];//stores all the differences from z from each letter in the string input
    }

    for(int i=0;i<biggest(trail)+1;i++){//makes the loop the biggest difference from z
      for(int j=0;j<input.length();j++){//outputs the letter trails
        letters[j]=(char)(input.charAt(j)+i);//stores the next letter in the alphabet using ASCII
        if(letters[j]>'z')//if it already equals z, print it because the ASCII table continues from z
          letters[j]='z';
        System.out.print(letters[j]);//prints out the letter
      }//for
      System.out.println();//prints the next line
    }//for
      
      
      
  }
  
  public static int biggest(int[] array){
    //Pre: It's an integer array
    //Post: Returns the biggest value in the array
    Arrays.sort(array);//sorts the array least to greatest
    
    return array[array.length-1];//returns the last value which is the biggest value
  }//biggest method
}