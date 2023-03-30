package Exerciciojava;

import java.util.Scanner;

public class Questao {
 static Scanner sc = new Scanner(System.in);

    public static void Exercicio1() {
            System.out.println("Digite o Valor 1");
            int valor1 = sc.nextInt();
            System.out.println("Digite o Valor 2");
            int valor2 = sc.nextInt();
            System.out.println("Digite o Valor 3");
            int valor3 = sc.nextInt();
            System.out.println("Digite o valor 4");
            int valor4 = sc.nextInt();
            int nDigitado = sc.nextInt();
            if (nDigitado == 1) {
                int valorTotal1 = valor1 += valor2;
                System.out.println("O valor total é" + valorTotal1);
            } else if (nDigitado == 2) {
                int valorTotal2 = valor1 - valor2;
                System.out.println("O valor Total é" + valor2);
            } else if (nDigitado == 3) {
                int valorTotal3 = valor1 * valor2;
                System.out.println("O valor Total é" + valor3);
            } else if (nDigitado == 4) {
                int valorTotal4 = valor1 / valor2;
                System.out.println("O valor Total é" + valor4);
            }
        }
    
    public static void Exercicio2() {
        double nDigitado = sc.nextDouble();
        System.out.println("Digite o numero de Matricula");
        if (nDigitado % 4 == 0) {
            System.out.println("Você foi selecionado para o time do Cris");
        } else if (nDigitado % 4 == 1) {
            System.out.println("Você foi selecionado para o time do Greg");
        } else if (nDigitado % 4 == 2) {
            System.out.println("Você foi selecionado para o time do Caruso");
        } else if (nDigitado % 4 == 3) {
            System.out.println("Você foi selecionado para o time do Jerome");
        } else {
            System.out.println("Digite o numero novamente");
        }
    }

    public static void Exercicio3() {
        System.out.println("Digite a Quantidade de Morangos");
        double Morangos = sc.nextDouble();
        System.out.println("Digite a Quantidade de Maças");
        double Maças = sc.nextDouble();
        System.out.println("Digite a Quantidade de Bananas");
        double Bananas = sc.nextDouble();

        int quantidade = sc.nextInt();
        double valorMorango = 2.50;
        double valorMaças =  1.80;
        double valorBanana = 1.30;
        double valorDesconto = 0.1;
        System.out.println("O valor Total é");
        
        double precototal = Morangos*valorMorango;
        double precototal1 = Maças*valorMaças;
        double precototal2 = Bananas*valorBanana;
        double valortotal = valorMorango*valorMaças*valorBanana;

        double kgFrutas = Morangos+Maças+Bananas;
            if(precototal>25.00||kgFrutas>8){
                precototal = precototal-precototal*valorDesconto;
            }

    }
}

