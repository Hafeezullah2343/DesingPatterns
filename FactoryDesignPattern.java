package DesignPattern;

interface Payment{
    void pay(double price);
}

class CreditCard implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("credit card pay cost $" + price);
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("debit card pay cost $" + price);
    }
}

class BankCard implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("bank card pay cost $" + price);
    }
}

class DigitalWallet implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("digita wallet pay cost $" + price);
    }
}

class PaymentFactory{

    public static Payment getInstance(String type){

        if (type == null){
            return null;
        }

        if (type.equalsIgnoreCase("CreditCard")){
            return new CreditCard();
        }else if (type.equalsIgnoreCase("DebitCard")){
            return new DebitCard();
        }else if (type.equalsIgnoreCase("BankCard")){
            return new BankCard();
        }else if (type.equalsIgnoreCase("DigitalWallet")){
            return new DigitalWallet();
        }
        return null;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Payment creditCard = PaymentFactory.getInstance("CreditCard");
        creditCard.pay(10);
    }
}