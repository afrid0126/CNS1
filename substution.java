import java.util.*;
class Substitution{
 public static void main(String[] a){
 String p="abcdefghijklmnopqrstuvwxyz";
 String k="qwertyuiopasdfghjklzxcvbnm";
 Scanner sc=new Scanner(System.in);
 System.out.print("Text:");
 String s=sc.nextLine().toLowerCase();
 String enc="",dec="";
 for(char c:s.toCharArray()) enc+=k.charAt(p.indexOf(c));
 System.out.println("Encrypted:"+enc);
 for(char c:enc.toCharArray()) dec+=p.charAt(k.indexOf(c));
 System.out.println("Decrypted:"+dec);
 }
}
 Substitution