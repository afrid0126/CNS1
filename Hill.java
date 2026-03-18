import java.util.*;
class Hill{
 public static void main(String[] a){
 Scanner sc=new Scanner(System.in);
 System.out.print("Text(2 letters): ");
 String s=sc.next().toUpperCase();
 int[][] k={{3,3},{2,5}};
 int[] x={s.charAt(0)-65,s.charAt(1)-65};
 int c1=(k[0][0]*x[0]+k[0][1]*x[1])%26;
 int c2=(k[1][0]*x[0]+k[1][1]*x[1])%26;
 System.out.println("Encrypted:"+(char)(c1+65)+""+(char)(c2+65));
 }
}
 Hill.