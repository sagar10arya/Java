import java.lang.*;


/*
- The final keyword is a non-access modifier used for classes, attributes and methods, used to define constants
- The class cannot be inherited by other classes 
- Attributes and methods cannot be overridden/modified
*/

final class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

// error: cannot inherit from final A
/*
class B extends A 
{
    
    void m1()
    { 
        // Compile-error! We can not override final method
        System.out.println("Illegal!");
    }
    
}
*/

class final_keyword
{
    public static void main(String a[])
    {
        // Define a constant variable PI
        final double PI = 3.14159;

        // Print the value of PI
        System.out.println("Value of PI: " + PI);
    }
}