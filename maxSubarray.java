
import java.util.*;

public class maxiSubarray{

public static int[] findCrossMaxi(int a[], int low, int mid, int high)
{
int leftSum = Integer.MIN_VALUE;
int sum=0;
int leftMaxIndex=0;
for(int i=mid;i>=low;i--)
{
    sum = sum+a[i];
    if(sum>leftSum)
    {
        leftSum=sum;
        leftMaxIndex=i;

    }
}
int rightSum = Integer.MIN_VALUE;
sum=0;
int rightMaxIndex=0;
for(int i=mid+1;i<=high;i++)
{
    sum=sum+a[i];
    if(sum>rightSum){
        rightSum=sum;
        rightMaxIndex=i;
    }
}
int overAllSum = leftSum+rightSum;
int[] crossOver = {leftMaxIndex, rightMaxIndex, overAllSum};
return crossOver;

}




public static int[] findMaximum(int a[], int low, int high)
{
    if(low==high)
    {
        int sumFirst = a[low];
        int[] overall = {low, high, sumFirst};
        return overall;
    }
    int mid = (low+high)/2;
    System.out.println("Left Half begin: "+low+" "+mid+" "+high);

    int[] left= findMaximum(a, low, mid);

    System.out.println("Left Half Finish: "+low+" "+mid+" "+high);

    int[] right = findMaximum(a, mid+1, high);

    System.out.println("right Half Finish: "+low+" "+mid+" "+high);

    int[] cross = findCrossMaxi(a,low,mid,high);

    System.out.println("cross Finish: "+low+" "+mid+" "+high);

    if(left[2]>=right[2] & left[2]>=cross[2])
    {
        return new int[] {left[0], left[1], left[2]};
    }
    else if(right[2]>=left[2] & right[2]>=cross[2])
    {
        return new int[] {right[0], right[1], right[2]};
    }
    else{
        return new int[] {cross[0], cross[1], cross[2]};
    }
    

}

    public static void main(String[] args)
    {
        int a[] = {25,-33,-1,3,4,-5,9,-2};  
        System.out.println(a);
        int[] finalValue = findMaximum(a, 0, 7);
        System.out.println("All Finish This is final One");
        System.out.println(finalValue[0]+" "+finalValue[1]+" "+finalValue[2]);
    }
}




