package DSA_Sheet.LanguageBasics;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeNumberCheck(int n){
        if(n<=1){
            return false;
        }
        int count=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if (count>2){
            return false;
        }
        else{
            return true;
        }
    }

    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you want to check:");
        int num= sc.nextInt();
        if(!primeNumberCheck(num)){
            System.out.println("Not a Prime Number.");
        }
        else{
            System.out.println("Number is Prime");
        }
    }
}
