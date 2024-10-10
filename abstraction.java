/* 
- Data abstraction is the process of hiding certain details and showing only essential information to the user.

The abstract keyword is a non-access modifier, used for classes and methods:
i) Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
ii) Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
iii) An abstract class can have both abstract and regular methods


*/

// not possible to create an object of the Animal class
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

// To access the abstract class, it must be inherited from another class
// Subclass (inherit from Animal)
class Dog extends Animal {
  public void animalSound() {
    System.out.println("Let the dog say: bhau bhau");
  }
}


class abstraction
{
    public static void main(String a[])
    {
        Dog d = new Dog();
        d.animalSound();
        d.sleep();
    }
}