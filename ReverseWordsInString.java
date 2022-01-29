package week1.day2;

import java.util.Arrays;

public class ReverseWordsInString{
    public static void main(String []args){
        String test = "I am a software tester";
        String[] words=test.split(" ");
        String reverseString="";
        
      //  int length = test.length();
     
     for(String w:words){
         String reverseWord="";
     
         
        for(int i=w.length()-1;i>=0;i--){
            
            
            reverseWord = reverseWord+w.charAt(i);
           
            
            
            }
            
           
           reverseString =reverseString +reverseWord+" ";
           
           
        
        
          
        }
System.out.println(reverseString);

}
        
  

     }
