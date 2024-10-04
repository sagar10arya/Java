class Employee{
    int id;
    String name;

    void printDetails(){
        System.out.println(name + " has Id : " + id);
    }
}

class class_intro{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Sagar";
        e1.printDetails();
    }
}
