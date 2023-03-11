import java.util.Arrays;

public class StringMethods {
     public static void main(String[] args)
    {
        String name="Rucha Gaikwad";
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.charAt(6));
        System.out.println("      Rucha    ".trim());
        System.out.println("   RUUUCHA    ".strip());
        String a="RUCHA IS FROM PCCOER";
        System.out.println(Arrays.toString(a.split("")));
    }
}
