
public class practiceS {


static void generateSquare(int n){
    
 int[][] squareM = new int [n][n];
    
 int i = n / 2;
 int j = n - 1;
 
  for (int num = 1; num <= n * n;) {
   if(i == -1 && j == n)
   {
     j = n - 2;
     i = 0;
   }
   else {
   if(j == n)
      j = 0;       
   if(i < 0)
       i = n -1;
   }
   if (squareM[i][j] != 0) {
       j -= 2;
       i++;
       continue;
   }
   else 
       squareM[i][j] = num++;
       j++;
       i--;
  }
  System.out.println("The Magic square for " + n);
 
  System.out.println("Sum of each row column " + n * (n * n +1) / 2 + ":");
  for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++)
          System.out.print(squareM[i][j] + " ");
      System.out.println();
  }
}
    public static void main(String[] args) {
      
  generateSquare(7);
}
}