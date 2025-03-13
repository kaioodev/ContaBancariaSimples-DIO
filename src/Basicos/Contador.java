package Basicos;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: \n>>");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: \n>>");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (Exception ParametrosInvalidoaException) {

            System.out.println("\t*O segundo parâmetro deve ser maior que o primeiro!*");

        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroDois < parametroUm){

            throw new ParametrosInvalidosException();

        }

        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++){

            System.out.println("Numero: " + i);
        }
    }

    static class ParametrosInvalidosException extends Exception {} //crio uma exceção
}
