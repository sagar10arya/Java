class Employee{
    // instance variables
    int id;
    String name;

    void printDetails(){
        System.out.println(name + " has Id : " + id);
    }
}


// Static variable is shared by all the objects

class class_intro{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Sagar";
        e1.printDetails();
    }
}
