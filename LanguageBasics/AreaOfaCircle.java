package DSA_Sheet.LanguageBasics;

import java.util.Scanner;

public class AreaOfaCircle {
    public static double Area(double radius){
        double area=Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius Of a Circle:");
        double radius=sc.nextDouble();
        System.out.println(Area(radius)+" is your area of a circle.");
    }
}
