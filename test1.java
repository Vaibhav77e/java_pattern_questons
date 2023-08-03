//Question
/*/For a given input, implement the patterns below. The same program should print different
patterns from different inputs, as shown in the examples below./*/

/*ex output:
 Input | n = x ( determine the correct value of x from the pattern )
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7
    1 2 3 4 5
      1 2 3
        1

Input | n = y ( determine the correct value of y from the pattern )
1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3
      1
 */


import java.util.Scanner;

public class test1 {
    public static void main(String args[]
    ){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();
 int i,j,k;
 int sub =n;
for( j=1;j<=(n/2)+1;j++){
    for (k = 1; k < j; k++)
    System.out.print("  ");
     for( i=1;i<=sub;i++){
    System.out.print(i+" ");
}
sub = sub-2;
System.out.println();
 }
    }
}
