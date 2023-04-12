package Com.bridgelabz.dayone;

import java.time.Year;
import java.util.Scanner;

public class Leapyearonedat {
    public static void main(String[] args){
        int Year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        Year = sc.nextInt();
        if(((Year%4==0)&&(Year%100!=0))||(Year%400==0)){
                System.out.println("The Year is Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}