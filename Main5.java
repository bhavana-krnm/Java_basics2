class Payment{
    void pay(double amount){
        System.out.println("Processing generic payment of ₹" + amount);
    }
}
class CreditCard extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
}
class UPI extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}

class Main5{
    public static void main(String[] args){
        Payment[] payments = {
            new CreditCard(),
            new UPI()
        };
        for (Payment payment : payments) {
            payment.pay(1500.0);
    }
}
}
