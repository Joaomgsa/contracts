package model.entities;

import java.util.Date;

public class Contract {

    private int number;
    private Date date;
    private Double totalValue;

    private Installment installment;

    public Contract(int number, Date date, Double totalValue, Installment installment) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installment = installment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Installment getInstallment() {
        return installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }
}
