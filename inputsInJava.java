import java.util.*;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/*

- The Scanner class is used to get user input, and it is found in the java.util package.
    Method	             Description
- nextBoolean()	   Reads a boolean value from the user
- nextByte()	   Reads a byte value from the user
- nextDouble()	   Reads a double value from the user
- nextFloat()	   Reads a float value from the user
- nextInt()	       Reads a int value from the user
- nextLine()	   Reads a String value from the user
- nextLong()	   Reads a long value from the user
- nextShort()	   Reads a short value from the user

*/

class inputsInJava
{
    // public static void main(String[] args) throws IOException
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");

        /*
        // 1st Way
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());  // bf.readLine() -> return string
        System.out.println(num);
        bf.close();
        */

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println("Number is " + num);
    }
}