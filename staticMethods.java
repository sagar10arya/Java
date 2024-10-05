/*

Static method:
- A static method in Java is a method that is part of a class rather than an instance of that class.
- Static methods have access to class variables (static variables) without using the class’s object (instance).
- Only static data may be accessed by a static method. It is unable to access data that is not static (instance variables).
- In both static and non-static methods, static methods can be accessed directly.

*/

class ABC {
    
    static int a = 40;  // static variable
    int b = 50;     // instance variable

    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }

    static int num = 100;
    static String str = "GeeksForGeeks";
    // This is Static method
    static void display()
    {
        System.out.println("static number is " + num);
        System.out.println("static string is " + str);
    }

    // Declaration of a static method.
    static void staticDisplay()
    { 
      System.out.println(a); 
    }
}

class staticMethods{
    
    public static void main(String a[])
    {
        ABC obj = new ABC();
        obj.simpleDisplay();

        // Calling static method.
        ABC.staticDisplay();

        ABC.display();
    }
}
