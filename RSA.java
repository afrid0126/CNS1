import java.math.*;
import java.util.*;
class RSA{
 public static void main(String[] a){
 Scanner sc=new Scanner(System.in);
 System.out.print("p:");
 BigInteger p=sc.nextBigInteger();
 System.out.print("q:");
 BigInteger q=sc.nextBigInteger();
 BigInteger n=p.multiply(q);
 BigInteger phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
 BigInteger e=new BigInteger("17");
 BigInteger d=e.modInverse(phi);
 System.out.print("Message:");
 String m=sc.next();
 for(char ch:m.toCharArray()){
 BigInteger enc=BigInteger.valueOf(ch).modPow(e,n);
 System.out.print((char)enc.modPow(d,n).intValue());
 }
 }
}
rsa