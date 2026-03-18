import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;
import java.util.Base64;

class DES{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Text:");
        String t = sc.nextLine();
        System.out.println("Key:");
        String k = sc.nextLine();
        
        SecretKeySpec key = new SecretKeySpec(k.getBytes(),"DES");
        Cipher c = Cipher.getInstance("DES");
        // encryption
        c.init(Cipher.ENCRYPT_MODE,key);
        String e = Base64.getEncoder().encodeToString(c.doFinal(t.getBytes()));
        System.out.println("Encrypted:"+e);
        
        //decrypt
        c.init(Cipher.DECRYPT_MODE,key);
        System.out.println("Decrypted:"+new String(c.doFinal(Base64.getDecoder().decode(e))));
    }
}  des