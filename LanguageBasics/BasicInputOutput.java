package DSA_Sheet.LanguageBasics;

import java.util.Scanner;
public class BasicInputOutput {
    public static int product(int A,int B){
        int C=A*B;
        return C;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value Of A:");
        int A=sc.nextInt();
        System.out.println("Enter The Value Of B:");
        int B=sc.nextInt();
        System.out.println(product(A,B));

    }
}
