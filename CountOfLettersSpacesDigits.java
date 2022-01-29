package week1.day2;
import java.util.Arrays;

public class CountOfLettersSpacesDigits{
    public static void main(String []args){
        String test = "$$ Welcome to 2nd Class of Automation $$ ";
        int letter =0,space =0,num=0,specialChar=0;
        
        
        int length = test.length();
        System.out.println(length);
         char[] a = test.toCharArray();
         
        for(int i=0;i<=length-1;i++){
            if(Character.isLetter(a[i]))
                letter++;
                else if(Character.isDigit(a[i]))
                num++;
                else if((Character.isSpaceChar(a[i])))
                space++;
                else
                specialChar++;
                
            
            
            }
            
           
           
           
        
          System.out.println("Letters:"+letter);
           System.out.println("Digits:"+num);
            System.out.println("spaces:"+space);
             System.out.println("SpecialChar:"+specialChar);
          
        }



        
  

     }