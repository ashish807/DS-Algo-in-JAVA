import java.util.*;
public class SquareMatrix{

    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the value of n in nxn: ");
       int n = scanner.nextInt();
       int[][] a = new int[n][n];
       int[][] b = new int[n][n];

       for(int i=0; i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.println("Enter the value for "+i+"th row and "+j+"th column");
               System.out.println("For a: ");
               a[i][j] =scanner.nextInt();
               System.out.println("For b: ");
               b[i][j] = scanner.nextInt();
           }
       }
       
      int[][] c = new int[n][n];

      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              c[i][j]=0;
              for(int k=0;k<n;k++)
              {
                  c[i][j]+=a[i][k]*b[i][k];
              }
          }
      }
       System.out.println(Arrays.deepToString(c));


    }
    
   

}