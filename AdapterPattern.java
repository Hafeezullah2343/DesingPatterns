package DesignPattern;

// -----------------------------
// Target Interface (What client expects)
interface PaymentGetaway{
    void pay(double amount);
}


// -----------------------------
// New Payment Implementation (can be Old system too if using Adapter)
class HBL implements PaymentGetaway{

    @Override
    public void pay(double amount) {
        System.out.println("HBL Payment:"+amount);
    }
}

// -----------------------------
// New Payment Implementation (can be Old system too if using Adapter)
class UBL implements PaymentGetaway{

    @Override
    public void pay(double amount) {
        System.out.println("UBL Payment:"+amount);
    }
}


// -----------------------------
// New Payment Implementation (can be Old system too if using Adapter)
class JazzCash implements PaymentGetaway{

    @Override
    public void pay(double amount) {
        System.out.println("Jazz cash Payment:"+amount);
    }
}




public class AdapterPattern {

    public static void main(String[] args) {

        PaymentGetaway paymentGetaway = new HBL();
        paymentGetaway.pay(0);
    }
}