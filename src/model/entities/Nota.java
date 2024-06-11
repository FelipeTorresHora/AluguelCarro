package model.entities;

public class Nota {
    private Double basicPayment;
    private Double taxa;

    public Nota(){
    }
    public Nota(Double basicPayment, Double taxa) {
        this.basicPayment = basicPayment;
        this.taxa = taxa;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return taxa;
    }

    public void setTax(Double taxa) {
        this.taxa = taxa;
    }
    public Double getTotalPayment(){
        return basicPayment + taxa;
    }
}
