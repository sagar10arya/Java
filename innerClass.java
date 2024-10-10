

class OuterClass {
  int x = 10;

    class InnerClass {
        int y = 5;
    }
    
    // An inner class can also be static, which means that you can access it without creating an object of the outer class:
    static class statClass{
        public void show(){
            System.out.println("Static inner class");
        }
    }
}

// class A{
abstract class A{
    public void show(){
        System.out.println("A Show");
    }
}

// Note: just like static attributes and methods, a static inner class does not have access to members of the outer class

class innerClass
{
    public static void main(String a[])
    {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        System.out.println(outerObj.x + innerObj.y);

        OuterClass.statClass inner = new OuterClass.statClass();
        inner.show();

        // Anonymous inner class
        A obj = new A()
        {
            public void show(){
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.show();
    }   
}