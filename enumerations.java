/* 
- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)
- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters

// Difference between Enums and Classes : 
- An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
- An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
*/


enum Status{
    RUNNING, FAILED, PENDING, SUCCESS;
}

class enumerations
{
    public static void main(String[] args)
    {
        Status s = Status.RUNNING;
        // System.out.println(s);

        // Status[] ss = Status.values();
        // for(Status s : ss)
        // {
        //     System.out.println(s + " " + s.ordinal());
        // }

        System.out.println(s.getClass().getSuperclass());   // class java.lang.Enum

        // Enum in a Switch Statement

        switch(s)
        {
            case RUNNING:
                System.out.println("Going on");
                break;
            
            case FAILED:
                System.out.println("Try Again");
                break;
            
            case PENDING:
                System.out.println("Please Wait");
                break;
            
            case SUCCESS:
                System.out.println("Completed");
                break; 
        }

    }
}