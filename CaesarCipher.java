//Vic Tong
//Nov 14th 2019
//Caesar Cipher
//Deciphers a Caesar Cipher given the cipher and shift
import java.util.*;

public class CaesarCipher{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);//declares the scanner object
    
    System.out.println("Enter the cipher");
    String code=s.nextLine();//asks the user for the cipher
    
    System.out.println("What is the shift?");
    int shift=s.nextInt();//asks the user for the shift
    
    StringTokenizer sentence=new StringTokenizer(code);//puts the cipher in StringTokenizer object
    while(sentence.hasMoreTokens())
      System.out.print(decode(sentence.nextToken(),shift)+" ");//prints out the decoded cipher 
    
  }
  public static String decode(String code, int shift){
    StringBuffer s=new StringBuffer("");

    code=code.toLowerCase();//makes all the letters lowercase as to not interfere with the ASCII table
    char[] letters=code.toCharArray();//turns the word into a char array

    for(int i=0;i<letters.length;i++){
      if(letters[i]>97&&letters[i]<123){
        letters[i]-=shift;//shifts it back down according to the shift parameter
        if(letters[i]<97)//if the letter isn't an alaphabet
          letters[i]+=26;//adds 27 because it's less than 97 on the ASCII table
      }
     
      s.append(letters[i]);//slowly adds each letter to build a word
    }

    return s.toString();//returns the decoded word
  }//decode method
  
}
      
      
      