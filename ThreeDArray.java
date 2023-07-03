import java.util.*;
public class ThreeDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        int b[][]= new int[4][4];
        int c[][][]=new int[4][4][4];
        for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                c[i][j][k]=i+j+k;
            }
          }
        }
         for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                System.out.print(" "+c[i][j][k]);
            }
          }
        }
    }
}
