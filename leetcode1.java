import java.util.*;
public class leetcode_1
{
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int nums[];
        nums=new int [n];
        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        int target=0;
        System.out.println("Enter the target number:");
        target=s.nextInt();
        for(int j=0;j<n;j++)
        {
            int sum=0;
            sum=nums[j]+nums[j+1];
            if(sum==target)
            {
                System.out.println("["+j+","+(j+1)+"]");
                break;
            }
        }
    }
}