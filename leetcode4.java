import java.util.*;
public class leetcode_5
{
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the elements of the array:");
        for(int a=0;a<n;a++)
        {
            arr[a]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            temp=0;
        }
        System.out.print("Sorted array: [");
        for(int b=0;b<n;b++)
        {
            if(b!=n-1)
            {
                System.out.print(arr[b]+",");
            }
            else
            {
                System.out.print(arr[b]+"]");
            }
        }
    }
}