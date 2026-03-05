package DesignPattern;

interface Shirt{
    void wear();
}

interface Bottom{
    void wear();
}

//Concrete product

class BoyShirt implements Shirt{

    @Override
    public void wear() {
        System.out.println("Wearing boy shirt...");
    }
}

class BoyPant implements Bottom{

    @Override
    public void wear() {
        System.out.println("Wearing boy pant..");
    }
}

class GirlShirt implements Shirt{

    @Override
    public void wear() {
        System.out.println("Wearing girl shirt..");
    }
}

class GirlPant implements Bottom{

    @Override
    public void wear() {
        System.out.println("Wearing girl pant..");
    }
}

interface AbstractFactory{
    Shirt createShirt();
    Bottom createBottom();
}

class BoyFormFactory implements AbstractFactory{

    @Override
    public Shirt createShirt() {
        return new BoyShirt();
    }

    @Override
    public Bottom createBottom() {
        return new BoyPant();
    }
}

public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {

        AbstractFactory obj = new BoyFormFactory();
        Shirt shirt = obj.createShirt();
        Bottom bottom = obj.createBottom();

        shirt.wear();
        bottom.wear();

    }
}
