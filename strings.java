

class Strings{
    public static void main(String[] args)
    {
        /* 
        // String are Immutable.

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length()); // 26

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // HELLO WORLD
        System.out.println(txt1.toLowerCase());   // hello world

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));  // 7
        */

        /* ----- String Buffer and String Builder ------ */
        // String Buffer -> string is mutable

        StringBuffer sb = new StringBuffer("Ironman");
        System.out.println(sb.capacity()); // 16 + 7 = 23
        // System.out.println(sb.length());    // 7

        sb.append(" is Tony");
        System.out.println(sb);   // Ironman is Tony

        // StringBuffer is threat safe while StringBuilder is not

    }
}
