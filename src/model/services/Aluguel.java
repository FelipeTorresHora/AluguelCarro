package model.services;

import model.entities.AluguelCarro;
import model.entities.Nota;
import java.time.Duration;

public class Aluguel {
    private Double precohora;
    private Double precodia;
    private Imposto imposto;

    public Aluguel(Double precohora, Double precodia, Imposto imposto){
        this.precohora = precohora;
        this.precodia = precodia;
        this.imposto = imposto;
}
    public void fazendonota(AluguelCarro aluguelCarro){
        double minuto = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        double hora = minuto / 60.0;

        double basicPayment;
        if (hora <= 12.0){
            basicPayment = precohora * Math.ceil(hora);
        }
        else{
            basicPayment = precohora * Math.ceil(hora/24.0);
        }

        double taxa = imposto.taxa(basicPayment);
        aluguelCarro.setNota(new Nota(basicPayment, taxa));
    }
}
