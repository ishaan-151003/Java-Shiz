import java.util.*;
public class leetcode_2 
{
    public boolean isPalindrome(int x) 
    {
        int t=x;
        int rev=0;
        for(;t!=0;t/=10)
        {
            int r=t%10;
            rev=rev*10+r;
        }
        if(rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        if(n<0)
        {
            System.out.println("Not a Palindrome");
        }
        else if(isPalindrome(n))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}