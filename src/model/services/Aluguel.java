package model.services;

import model.entities.AluguelCarro;
import model.entities.Nota;

import java.time.Duration;

public class Aluguel {
    private Double precohora;
    private Double precodia;
    private BrasilImposto taxaservico;

    public Aluguel(Double precohora, Double precodia, BrasilImposto taxaservico){
        this.precohora = precohora;
        this.precodia = precodia;
        this.taxaservico = taxaservico;
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

        double taxa = taxaservico.taxa(basicPayment);
        aluguelCarro.setNota(new Nota(basicPayment, taxa));
    }
}
