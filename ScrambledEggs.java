//Vic Tong
//Nov 14th 2019
//Scrambled Eggs
//Given a sentence, the program will randomly output all the letters of the words scrambled
import java.util.*;
import java.lang.Math;

public class ScrambledEggs{
  public static void main(String []args){
    Scanner s=new Scanner(System.in);//declares the scanner object
    
    System.out.println("Enter a sentence/word");
    String sentence=s.nextLine();//gets the sentence
    
    StringTokenizer random=new StringTokenizer(sentence);//puts the sentence into a StringTokenizer object
    while(random.hasMoreTokens()){
      sentence=random.nextToken();//gets the next token
      System.out.print(scramble(sentence)+" ");//scrambles each sentence using the scramble method
    }//while
  }
  public static String scramble(String word){
    StringBuffer s=new StringBuffer("");
    int random;
    int index[]=new int[word.length()];
    for(int i=0;i<word.length();i++){
      index[i]=i;//stores the entire index into the index array
    }
    
    for(int i=0;i<word.length();i++){
      random=(int)(Math.random()*word.length());//generates a random number from the index
      while(index[random]<0)//it will keep the generating a new number till it's not a negative number
        random=(int)(Math.random()*word.length());
      
      s.append(word.charAt(index[random]));//adds it to the StringBuffer object
      index[random]=-1;//changes that index value to negative to let the program know it was already used
                   
      
    }
    return s.toString();//returns the scrambled word
  }//scramble method
    
      
    
}//ssalc
    
    