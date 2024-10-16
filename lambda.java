/* 
- A functional interface is an interface that contains only one abstract method
- Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface.
*/

/*
******Java Lambda Expressions********
- A lambda expression is a short block of code which takes in parameters and returns a value

*/

@FunctionalInterface
interface A
{
    // void show();
    int add(int i, int j);
}

class lambda
{
    public static void main(String[] args)
    {
        // A obj = () -> System.out.println("in A Show");
        // obj.show();

        
        A obj1 = (i, j) -> i + j;
        int res = obj1.add(10,5);
        System.out.println(res);
    }
}