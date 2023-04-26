/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo.Lista;

import java.util.Scanner;

public class TesteJogoSe {
    public static void main(String[] args) {
     Scanner jogar = new Scanner(System.in);
        System.out.println("Pedra-Papel-Tesoura é um jogo simples para ser jogado \n"
        +"apenas com as mãos e que não requer \n" +"nenhuma habilidade especial ou \n"+
        "equipamentos específicos.");
        System.out.println("|----------------------------------------------------|");
        System.out.println("| Regras:                                            |");
        System.out.println("| Pedra ganha da tesoura (amassando-a ou quebrando-a)|");
        System.out.println("| tesoura ganha do papel (cortando-o)                |");
        System.out.println("| papel ganha da pedra (embrulhando-a)               |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("Digite seu nome: ");
        String nome = jogar.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("|Pedra = 1 /n Papel = 2 /n Tesoura = 3|");
        System.out.println("-------------------------------------");
        System.out.println("Faça sua jogada: " +nome);
        int jogador = jogar.nextInt();
        int maquina = (int) (Math.random() * 3 + 1);
        System.out.println(nome+" escolheu: "+jogador);
        System.out.println("Maquina escolheu: "+maquina);
        
        switch(jogador){
          
            case 1:
                if(maquina == 3){
                    System.out.println(nome+" venceu!");
            }else{
                    System.out.println("Maquina venceu jogo!");
                }
            break;
            case 2:
                if(maquina == 1){
                    System.out.println(nome+" venceu!");
            }else{
                System.out.println("Maquina venceu! Jogou Tesoura");
            }
            break;
            case 3:
            if(maquina == 1){
                    System.out.println("Maquina venceu! Jogou Pedra");
            }else{
                    System.out.println(nome+" venceu!");
                    break;
            }
            defaut:
            System.out.println("Jogada invalida!");
            }
        }
    }
