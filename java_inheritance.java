// Note: Multiple inheritance is not supported in JAVA

class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Peep Peep");
    }
}

class Car extends Vehicle{
    String modelName= "Mustang";
}

class java_inheritance
{
    public static void main(String a[])
    {
        Car c1 = new Car();

        c1.honk();

        System.out.println(c1.brand + " " + c1.modelName);
    }
}