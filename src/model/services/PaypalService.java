package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double interest(double amount, int months) {
        return (amount * months * 0.01) ;
    }

    @Override
    public Double paymentFee(double amount) {
        return (amount * 0.02);
    }
}
