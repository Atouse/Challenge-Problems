//Vic Tong
//Last Modified: Nov 8th 2019
//Alphabetical Order
//Alphabetically sorts a list of names and outputs it into a new file
import java.io.*;//imports the needed files

public class AlphabeticalOrder{
  public static void main(String []args) throws IOException{
    
    //stores the input file into "input"
    BufferedReader input=new BufferedReader(new FileReader("names.txt"));
    
    //stores the output file into "output"
    PrintWriter output=new PrintWriter(new FileWriter("newnames.txt"));
    
    //creates a string array to store all the names
    String []names =new String[20];
    String temp;//creates the temporary variable to allow the array elements to switch
    
    //reads the input file and stores them into the string array
    for(int i=0;i<20;i++){
      names[i]=input.readLine();
    }
    
    //uses the bubble sort algorithm to alphabetically sort the array
    for(int i=0;i<20;i++){
      for(int j=i+1;j<20;j++){
        if(names[j].compareTo(names[i])<0){
          temp=names[i];
          names[i]=names[j];
          names[j]=temp;
        }
      }
      //prints the name into the output file
      output.println(names[i]);
    }
    
    //closes the file after its done
    output.close();
  }//niam
}//ssalc
    