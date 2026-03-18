import java.security.*;
import java.util.*;
class MD5{
 public static void main(String[] a)throws Exception{
 Scanner sc=new Scanner(System.in);
 System.out.print("Text:");
 String s=sc.nextLine();
 MessageDigest md=MessageDigest.getInstance("MD5");
 byte[] b=md.digest(s.getBytes());
 for(byte x:b) System.out.print(String.format("%02x",x));
 }
}
md5