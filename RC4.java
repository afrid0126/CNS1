import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;
import java.util.Base64;
class RC4{
 public static void main(String[] a)throws Exception{
 Scanner sc=new Scanner(System.in);
 System.out.print("Key:");
 String k=sc.nextLine();
 System.out.print("Text:");
 String t=sc.nextLine();
 SecretKeySpec key=new SecretKeySpec(k.getBytes(),"RC4");
 Cipher c=Cipher.getInstance("RC4");
 c.init(Cipher.ENCRYPT_MODE,key);
 String e=Base64.getEncoder().encodeToString(c.doFinal(t.getBytes()));
 System.out.println("Encrypted:"+e);
 c.init(Cipher.DECRYPT_MODE,key);
 System.out.println("Decrypted:"+new String(c.doFinal(Base64.getDecoder().decode(e))));
 }
}
RC4