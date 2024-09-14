package br.inatel.pcmania;

import java.util.ArrayList;

public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public ArrayList<HardwareBasico> hardwares;
    public MemoriaUSB memoriaUSB;

    // Construtor
    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, ArrayList<HardwareBasico> hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwares = hardwares;
    }


    public void mostraPCConfigs() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional.nome + " (" + this.sistemaOperacional.tipo + "-bits)");
        System.out.println("Hardwares:");
        for (HardwareBasico hardware : hardwares) {
            System.out.println("- " + hardware.nome + ": " + hardware.capacidade);
        }
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + this.memoriaUSB.nome + " - " + this.memoriaUSB.capacidade + " GB");
        }
    }


    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }
}