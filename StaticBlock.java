import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlock {

    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = false;
    static {
        if(B>0 && H>0)
            flag = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

