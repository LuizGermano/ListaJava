/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo.Lista;

 
import java.util.Scanner;
import java.util.Random;

public class TesteJoo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] jogadas = {"pedra", "papel", "tesoura"};
        int jogadaComputador;
        String jogadaJogador;
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.print("Escolha pedra, papel ou tesoura: ");
            jogadaJogador = input.nextLine().toLowerCase();
            jogadaComputador = random.nextInt(3);

            if (jogadaJogador.equals(jogadas[jogadaComputador])) {
                System.out.println("Empate! Vamos jogar novamente.");
            } else if (jogadaJogador.equals("pedra")) {
                if (jogadas[jogadaComputador].equals("papel")) {
                    System.out.println("Você perdeu! Papel cobre pedra.");
                    jogarNovamente = false;
                } else {
                    System.out.println("Você ganhou! Pedra quebra tesoura.");
                    jogarNovamente = false;
                }
            } else if (jogadaJogador.equals("papel")) {
                if (jogadas[jogadaComputador].equals("tesoura")) {
                    System.out.println("Você perdeu! Tesoura corta papel.");
                    jogarNovamente = false;
                } else {
                    System.out.println("Você ganhou! Papel cobre pedra.");
                    jogarNovamente = false;
                }
            } else if (jogadaJogador.equals("tesoura")) {
                if (jogadas[jogadaComputador].equals("pedra")) {
                    System.out.println("Você perdeu! Pedra quebra tesoura.");
                    jogarNovamente = false;
                } else {
                    System.out.println("Você ganhou! Tesoura corta papel.");
                    jogarNovamente = false;
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}