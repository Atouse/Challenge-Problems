//Vic Tong
//Nov 14th 2019
//Permutations Investigation
//Given a word with no repeated letters, the program outputs the possible permutations of it
import java.util.Scanner;

public class Permutations{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);//declares the scanner object
    
    System.out.println("Enter a word");
    String word=s.nextLine();//gets the word
    String temp;
    String [] checkList=new String[factorial(word.length())];
    int counter=0;
    
    for(int i=0;i<factorial(word.length());i++){
      temp=scramble(word);//scrambles the word
      while(lookFor(checkList,temp))//if the word is already in the array it will keep scrambling till a new permutation is found
        temp=scramble(word);

      checkList[counter]=temp;//stores the scrambled word in the array to be used later
      System.out.println(checkList[counter]);//prints out the scrambled word
      counter++;//changes the index
    }//for i
  }//niam
  
 public static int factorial(int number) {
   int result = 1;
   
   for (int factor=2;factor<=number;factor++)
     result*=factor;
   
   return result;
 }//factorial method
   
  public static boolean lookFor(String [] list, String key){
    for(int i=0;i<list.length;i++){
      if(key.equals(list[i]))
        return true;
    }
    return false;
  }//lookFor method
 
 public static String scramble(String word){
   StringBuffer s=new StringBuffer("");
   int random;
   int index[]=new int[word.length()];
   for(int i=0;i<word.length();i++){
     index[i]=i;
   }
   
   for(int i=0;i<word.length();i++){
     random=(int)(Math.random()*word.length());
     while(index[random]<0){
       random=(int)(Math.random()*word.length());
     }
     s.append(word.charAt(index[random]));
     index[random]=-1;
     
     
   }
   return s.toString();
 }//scramble method
}