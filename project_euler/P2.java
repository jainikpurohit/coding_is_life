import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            findFib(n);
        }
    }
    
    public static void findFib(long n){
        long a = 1;
        long b = 2;
        long c = 0;
        long sum = 0;
        
        if(n > 1){
            while( c <= n){
                if(b % 2 == 0){
                    sum += b;
                }
                c = a+b;
                a = b;
                b = c;
            }        
        }
        System.out.println(sum);
        
    }
}
