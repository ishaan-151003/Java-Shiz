import java.util.*;
public class leetcode_3
{
   int Roman_to_Integer(String s)
   {
       char ch;
       s=s.toUpperCase();
       int n=0;
       int sum=0;
       int count=0;
       for(int j=0;j<s.length();j++)
       {
           count++;
       }
       for(int i=0;i<count;i++)
       {
           ch=s.charAt(i);
           switch(ch)
          {
             case 'I':n=1;
             sum=sum+n;
             break;
             case 'V':n=5;
             sum=sum+n;
             break;
             case 'X':n=10;
             sum=sum+n;
             break;
             case 'L':n=50;
             sum=sum+n;
             break;
             case 'C':n=100;
             sum=sum+n;
             break;
             case 'D':n=500;
             sum=sum+n;
             break;
             case 'M':n=1000;
             sum=sum+n;
             break;
             default: n=0;
             sum=sum+n;
             break;
          }
       }
       return sum;
   }
   void main()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Number in Roman:");
    String number=s.nextLine();
    System.out.println("The Number entered is:"+Roman_to_Integer(number));
  }
}