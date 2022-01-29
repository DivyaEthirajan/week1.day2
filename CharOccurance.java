package week1.day2;
import java.util.Arrays;

public class CharOccurance{


     public static void main(String []args){
           String str = "Welcome to namma chennai";
         char toFind = 'w';
         int occurence=0;
           
           str=str.toLowerCase();
           System.out.println(str);
           
         char[] a=  str.toCharArray();
         
  
int length = a.length;
for (int i=0;i<=length-1;i++){
    if(a[i]==toFind)
    occurence++;
    
    
}
        
         
           System.out.println(occurence);
     }
}