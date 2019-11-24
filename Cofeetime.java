package chapter3;

import java.util.Scanner;

public class Cofeetime {

    public  static  void  main (String args[]){
        System.out.println("Season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        //1. Season of the year

        System.out.println("Whole Num");
        int num = scanner.nextInt();
        //2. whole number

        System.out.println("Adjective mention");
        String adject = scanner.next();
        //3.adjective
        scanner.close();

        System.out.println("On a"+adject+ season+ "day, I drink a minmum of "+ num +"Cups of coffee.");
    }
}
