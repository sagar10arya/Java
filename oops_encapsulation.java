public class Person {
    private String name;
    private int age;

    // Contructor
    public Person()
    {
        age = 23;
        name = "Sagar";
        System.out.println("Constructor executed");
    }

    // Parameterized Contructor
    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
        System.out.println("Parameterized Constructor executed");
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

class oops_encapsulation
{
    public static void main(String a[])
    {
        Person myObj = new Person();
        myObj.setName("CR7");
        myObj.setAge(39);
        System.out.println(myObj.getName() + " : " + myObj.getAge());

        Person myObj1 = new Person();
        System.out.println(myObj1.getName() + " : " + myObj1.getAge());

        Person myObj2 = new Person(34, "Virat Kohli");
        System.out.println(myObj2.getName() + " : " + myObj2.getAge());

        // new Person();  // Anonymous object -> does not have a name

    }
}