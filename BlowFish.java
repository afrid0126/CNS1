import javax.crypto.*;
import java.util.*;
import java.util.Base64;
class Blowfish{
 public static void main(String[] a)throws Exception{
 Scanner sc=new Scanner(System.in);
 System.out.print("Text:");
 String t=sc.nextLine();
 KeyGenerator kg=KeyGenerator.getInstance("Blowfish");
 SecretKey k=kg.generateKey();
 Cipher c=Cipher.getInstance("Blowfish");
 c.init(Cipher.ENCRYPT_MODE,k);
 String e=Base64.getEncoder().encodeToString(c.doFinal(t.getBytes()));
 System.out.println("Encrypted:"+e);
 c.init(Cipher.DECRYPT_MODE,k);
 System.out.println("Decrypted:"+new String(c.doFinal(Base64.getDecoder().decode(e))));
 }
}
 blowfish