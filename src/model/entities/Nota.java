package model.entities;

public class Nota {
    private Double basicPayment;
    private Double tax;

    public Nota(){
    }
    public Nota(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotalPayment(){
        return basicPayment - tax;
    }
}
