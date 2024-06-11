package model.services;

public class BrasilImposto implements Imposto {

    public double taxa(double total){
        if (total <= 100.0){
            return total * 0.2;
        }
        else{
            return total * 0.15;
        }
    }
}
