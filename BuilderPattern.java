package DesignPattern;

//Builder design pattern
//Product class
//Builder class
//Client class


//Product Class
class QMobile{

    String name;
    int width;
    String color;
    int height;
    String display;

    void save(){
        System.out.println(name);
        System.out.println(width);
        System.out.println(color);
        System.out.println(height);
        System.out.println(display);
    }
}

//Builder class
class Builder {

    private QMobile mobile = new QMobile();

    Builder setName(String name){
        mobile.name = name;
        return this;
    }

    Builder setWidth(int width){
        mobile.width = width;
        return this;
    }

    Builder setColor(String color){
        mobile.color = color;
        return this;
    }

    Builder setHeight(int height){
        mobile.height = height;
        return this;
    }

    Builder setDisplay(String display){
        mobile.display = display;
        return this;
    }

    QMobile build(){
        return mobile;
    }
}

public class BuilderPattern {

    public static void main(String[] args) {

        QMobile mobile = new Builder()
                .setName("Nokia")
                .setColor("Black")
                .setWidth(2)
                .setHeight(4)
                .setDisplay("HD")
                .build();

        mobile.save();
    }
}