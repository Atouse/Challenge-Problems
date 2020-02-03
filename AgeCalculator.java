//Vic Tong
//Age Calculator
//Oct 24th 2019
//Outputs the date when the user turns 10 000 days old
import java.util.*;

public class AgeCalculator{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);//declares Scanner object
    
    //asks the user for their birthday
    System.out.println("Enter your birthday (MM/DD/YYYY)");
    String birth=s.nextLine();
    StringTokenizer date=new StringTokenizer(birth,"/");
    
    System.out.println("How many days do you want to turn?");
    int goal=s.nextInt();
    
    //converts the birthday to integers and stores them
    int month=Integer.parseInt(date.nextToken());
    int day=Integer.parseInt(date.nextToken());
    int year=Integer.parseInt(date.nextToken());
    int monthDays[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    int hold[]=new int[5];
    
    //calculates the months, days and years there are in goal days
    hold[0]=goal/365;
    hold[1]=goal-(hold[0]*365);
    for(int i=month-1;i<12;i++){
      hold[1]=hold[1]-monthDays[i];
      hold[2]++;
      if(hold[1]<31){
        break;
      }
    }
    
    //adds it to the birth date of the user
    year=year+hold[0];
    
    month=month+hold[2];
    if(month>12)
      month=month-12;
    
    day=day+hold[1];
    if(day>28)
      day=day-monthDays[month-1];
    
    
    //Outputs the date 
    System.out.println(month+"/"+day+"/"+year);
    
    
    
    
  }//niam
}//ssalc