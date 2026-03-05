package DesignPattern;

//Prototype Interface
interface Prototype{
    Prototype clone();
}

//Concrete Prototype
class Employee implements Prototype{

    String name;
    int age;

    Employee(String name , int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public Prototype clone() {
        return new Employee(this.name , this.age);
    }

    public void show(){
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
    }
}

public class PrototypeDesignPattern {

    public static void main(String[] args) {

        Employee obj = new Employee("Ali" , 10);
        obj.show();

        Employee obj2 = (Employee) obj.clone();
        obj2.show();

    }
}
