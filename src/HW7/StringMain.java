package HW7;

import java.util.Locale;

public class StringMain {
    public static void main(String[] args) {
        String str = "I like Java!";

        stringHandler(str);
    }

    private static void stringHandler(String str)
    {
        System.out.println(str.charAt(11));
        if(str.endsWith("java!"))
        {
            System.out.println("Строка содержит 'java!'");
        }
       if(str.startsWith("Добро пож"))
       {
           System.out.println("Строка содержит 'Добро пож'");
       }
       if(str.contains("Java")) {
           System.out.println("Строка содержит 'java!'");
       }
       String stringWithReplacement = str.replace('a', 'o');
        System.out.println(stringWithReplacement);
       String stringInUpperCase = str.toUpperCase(Locale.ROOT);//8
        System.out.println(stringInUpperCase);
       String stringInLowerCase = str.toLowerCase(Locale.ROOT);//9
         System.out.println(stringInLowerCase);
        int index = str.indexOf("Java");
        if(index >= 0) {
            String java = str.substring(index, index + 4);
            System.out.println(java);
        }

    }

}
