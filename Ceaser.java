import java.util.*;
class Caesar{
 public static void main(String[] a){
 Scanner sc=new Scanner(System.in);
 System.out.print("Text: ");
 String s=sc.nextLine();
 System.out.print("Key: ");
 int k=sc.nextInt();
 String enc="",dec="";
 for(char c:s.toCharArray()) enc+=(char)(c+k);
 System.out.println("Encrypted:"+enc);
 for(char c:enc.toCharArray()) dec+=(char)(c-k);
 System.out.println("Decrypted:"+dec);
 }
}
 Caeser.