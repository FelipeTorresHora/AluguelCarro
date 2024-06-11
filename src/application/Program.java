package application;

import model.entities.AluguelCarro;
import model.entities.Veiculo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Digite os dados do aluguel: ");
        System.out.print("Modelo do Carro: ");
        String carmodelo = sc.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(Sc.nextline(), fmt);
        System.out.print("Entregue (dd/mm/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(Sc.nextline(), fmt);

        AluguelCarro ac = new AluguelCarro(inicio,fim,new Veiculo(carmodelo));
        sc.close();
    }
}