//Vic Tong
//Pushin' It
//Nov 18th 2019
//Given an array and an input, it moves all the elements in the array that are equal to the input to the front
public class PushinIt{
  public static void main(String[]args){
    //inputs
    char[] array=new char[]{'A','B','C','C','D','D'};
    char key='D';
    
    //counter variable
    int counter=0;
    for(int i=0;i<array.length;i++){
      if(array[i]==key){//if the element in the array is equal to the input
        //switches the elements in the array
        array[i]=array[counter];
        array[counter]=key;
        counter++;
      }
      
    }//for
    
    //prints out the reconfigured array
    for(int i=0;i<array.length;i++){
      System.out.println(array[i]);
    }      
    
  }//niam
}//ssalc