import java.util.*;

public class InseryionSort{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Size of the array: ");
       int size = sc.nextInt();
       int number[] = new int[size];

       for(int i = 0; i<size;i++)
       {
           int count = i+1;
           System.out.println("Enter "+count+" number");
           int c = sc.nextInt();
           number[i] = c;

       }
       System.out.print("UnSorted Number: ");
       System.out.println(Arrays.toString(number));
       long start = System.currentTimeMillis();
       for(int j=1; j<size;j++)
       {
           int key = number[j];
           int leftHalf = j-1;
             while(leftHalf>=0 && key < number[leftHalf])
            {
                number[leftHalf+1] = number[leftHalf];  // this basically shift the left number by 1 to right
                leftHalf--;

            }
                number[leftHalf+1] = key;
       }
      long end = System.currentTimeMillis();

       long diff = end-start;
       System.out.print("Sorted Array: ");
       System.out.println(Arrays.toString(number));
       System.out.println("Time Take is : "+ diff);
    }
}