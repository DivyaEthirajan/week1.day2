package week1.day2;
public class Palindrome{


    public static void main(String []args){
         String name = "madam";
         String nme2 ="";
         int length = name.length();
         System.out.println(length);
         for(int i=length-1; i>=0;i--)
         {
             nme2 = nme2 + name.charAt(i);
             
         }
         System.out.println(nme2);
         if(nme2.equals(name)){
             System.out.println(name + ":the word is a palindrome");
         }
         else
          System.out.println(name + ":the word is not a palindrome");
                 
            
           
           
    }
}