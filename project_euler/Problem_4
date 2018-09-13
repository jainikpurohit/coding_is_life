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
            int n = in.nextInt();
            findLargestProduct(n);
        }
    }
    
    //TODO: handle test case #3 in hacker rank
    
    public static void findLargestProduct(int n){
        
        // minimum range specified in a problem
        int largest = 101101;
        for(int i = 100; i <= 999; i++){
            // check if we already have largest palindrom number then max possible multiplication of current element.
            if( largest >= i * 999){
                continue;
            }
            for(int j = i + 1; j <= 999; j++){
                int mul = i * j;
                if(mul > n){
                    continue;
                } else {
                    // check for palindrome
                    if(mul > largest && checkPali(mul)){
                       largest = mul; 
                    }
                }
            }
        }
        System.out.println(largest);
    }
    
    public static boolean checkPali(int n){
        // reverse number
        int rev = 0;                    
        int orig = n;                     
        while (orig > 0) {
            // generating reverse number of an n
            rev = 10 * rev + orig % 10;
            orig /= 10;
        }
        return n == rev;
    }
}
