package DesignPattern;

public class SingletonDesignPattern {


    private static volatile SingletonDesignPattern instance;

    private SingletonDesignPattern(){

    }

    public static SingletonDesignPattern getInstance(){
        if(instance == null){
            synchronized (SingletonDesignPattern.class){
                if(instance == null){
                    instance = new SingletonDesignPattern();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

    }
}