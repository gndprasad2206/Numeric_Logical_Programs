//write a java program to check whether a  year is a leap year or not 
import java.util.Scanner;
public class Leap_Year_1_Main{
  public static void main(String[] args){
    Leap_Year_1 sc=new Leap_Year_1();
    sc.year();
  }
}
class Leap_Year_1{
  public void year(){
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    year=sc.nextInt();
    if((year%4==0)&&((year%100!=0)||(year%400==0))){
      System.out.print(year+ " is leap year");
    }
    else{
      System.out.println(year+" is  not a leap year");
    }
  }
}