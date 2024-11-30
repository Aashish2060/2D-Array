import java.util.*;
public class Main {
    public static void resrch(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
               if(matrix[i][j]==key)
               {
                   System.out.println("found at" +"("+i+" , "+j+")");
               }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length,m= matrix.length;
        System.out.print("Enter matrix element ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix element is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key=4;
    resrch(matrix,key);
    }
}