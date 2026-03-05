package DesignPattern;

interface Car{
    public void driver();
}


class Bus implements Car{

    @Override
    public void driver() {
        System.out.println("Bus driver");
    }
}


class MotorCycle implements Car{

    @Override
    public void driver() {
        System.out.println("MotorCycle driver");
    }
}

class Factory{

    public static Car createObject(String type){
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("DesignPattern.creattionDesignPattern.Bus")){
            return new Bus();
        }
        if (type.equalsIgnoreCase("Motor Cycle")){
            return new MotorCycle();
        }
        return null;
    }
}


public class FactoryDesignPattern {

    public static void main(String[] args) {

        Car car1 = Factory.createObject("DesignPattern.creattionDesignPattern.Bus");
        car1.driver();
        Car car2 = Factory.createObject("Motor Cycle");
        car2.driver();

    }
}
