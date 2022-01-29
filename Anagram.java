package week1.day2;

import java.util.Arrays;

public class Anagram{


     public static void main(String []args){
           String name = "amma";
           String name2 ="mama";
           
         char[] a=  name.toCharArray();
         char[] b=  name2.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
         Boolean result = Arrays.equals(a,b);
         if(result==true){
             System.out.println("Anagram");
         }
         
        else
           System.out.println("non Anagram");
     }
}