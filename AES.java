import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;
import java.util.Base64;
class AES{
 public static void main(String[] a)throws Exception{
 Scanner sc=new Scanner(System.in);
 System.out.print("Text:");
 String t=sc.nextLine();
 String key="1234567890123456";
 SecretKeySpec k=new SecretKeySpec(key.getBytes(),"AES");
 Cipher c=Cipher.getInstance("AES");
 c.init(Cipher.ENCRYPT_MODE,k);
 String e=Base64.getEncoder().encodeToString(c.doFinal(t.getBytes()));
 System.out.println("Encrypted:"+e);
 c.init(Cipher.DECRYPT_MODE,k);
 System.out.println("Decrypted:"+new String(c.doFinal(Base64.getDecoder().decode(e))));
 }
}  aes