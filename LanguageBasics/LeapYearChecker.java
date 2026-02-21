package DSA_Sheet.LanguageBasics;

import java.util.Scanner;

public class LeapYearChecker {
    public static boolean leapYearChecker(int year){
        if((year%4==0 && year%100!=0) || (year%400==0)){
            return true;
        }else{
            return false;
        }
    }
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year that you want to check:");
        int year=sc.nextInt();
        if(!leapYearChecker(year)){
            System.out.println( "It is not a Leap Year.");
        }
        else{
            System.out.println("It is a Leap Year.");
        }

    }
}
