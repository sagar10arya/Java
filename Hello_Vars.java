class hello 
{
    public static void main(String args[])
    {
        System.out.print("Hello World");

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // TypeCasting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9

        int a = 257;
        byte k = (byte) a;
        System.out.println(k); // 1 --> 257 % 256
    }
}
// Java -> follows unicode
/* Data Type 
a. Primitive data types - includes byte, short, int, long, float, double,   boolean and char
b. Non-primitive data types - such as String, Arrays and Classes

1. Integer --> byte(1 byte), short(2 bytes), int(4 bytes), long(l)(8 bytes)
2. Float  --> float(f)(4 bytes), double(8 bytes)
3. Character --> char (2 bytes) 
4. Booleans --> boolean (true or false)
*/

/*
Data Type-->Size-->Description
byte --> 1 byte --> Stores whole numbers from -128 to 127
short --> 2 bytes --> -32,768 to 32,767
int --> 4 bytes -->  -2,147,483,648 to 2,147,483,647
long -->8 bytes --> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float --> 4 bytes --> Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double -->8 bytes --> Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean --> 1 bit --> Stores true or false values
char -->2 bytes --> Stores a single character/letter or ASCII values
 */
