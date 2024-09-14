package br.inatel.pcmania;

import java.util.ArrayList;
import java.util.Scanner;

public class PCMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        long cpfCliente = scanner.nextLong();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        int opcao;

        do {
            System.out.println("Escolha uma das promoções abaixo (1, 2, 3) ou 0 para finalizar a compra:");
            System.out.println("1 - Promoção Positivo");
            System.out.println("2 - Promoção Acer");
            System.out.println("3 - Promoção Vaio");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                ArrayList<HardwareBasico> hardwares = new ArrayList<>();
                hardwares.add(new HardwareBasico("Pentium Core i3", 2200));
                hardwares.add(new HardwareBasico("Memória RAM", 8));
                hardwares.add(new HardwareBasico("HD", 500));
                SistemaOperacional so = new SistemaOperacional("Linux Ubuntu", 32);
                Computador pc = new Computador("Positivo",  416, so, hardwares);
                pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
                cliente.comprar(pc);

            } else if (opcao == 2) {
                ArrayList<HardwareBasico> hardwares = new ArrayList<>();
                hardwares.add(new HardwareBasico("Pentium Core i5", 3370));
                hardwares.add(new HardwareBasico("Memória RAM", 16));
                hardwares.add(new HardwareBasico("HD", 1000));
                SistemaOperacional so = new SistemaOperacional("Windows 8", 64);
                Computador pc = new Computador("Acer", 1650, so, hardwares); // 416 + 1234
                pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
                cliente.comprar(pc);

            } else if (opcao == 3) {
                ArrayList<HardwareBasico> hardwares = new ArrayList<>();
                hardwares.add(new HardwareBasico("Pentium Core i7", 4500));
                hardwares.add(new HardwareBasico("Memória RAM", 32));
                hardwares.add(new HardwareBasico("HD", 2000));
                SistemaOperacional so = new SistemaOperacional("Windows 10", 64);
                Computador pc = new Computador("Vaio", 6094, so, hardwares); // 416 + 5678
                pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
                cliente.comprar(pc);
            }

        } while (opcao != 0);

        cliente.mostraComputadoresComprados();
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

        scanner.close();
    }
}