package br.inatel.pcmania;

import java.util.ArrayList;

public class Cliente {
    public String nome;
    public long cpf;
    public ArrayList<Computador> computadores = new ArrayList<>();

    // Construtor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void comprar(Computador computador) {
        computadores.add(computador);
    }


    public float calculaTotalCompra() {
        float total = 0;
        for (Computador computador : computadores) {
            total += computador.preco;
        }
        return total;
    }


    public void mostraComputadoresComprados() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        System.out.println("Computadores adquiridos:");
        for (Computador computador : computadores) {
            computador.mostraPCConfigs();
            System.out.println();
        }
    }
}