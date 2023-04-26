package Jogo;

import java.util.Scanner;

public class TesteJogo{
    public static void main(String[] args) {
        Scanner jogar = new Scanner(System.in);
        System.out.println("|----------------------------------------------------|");
        System.out.println("| Regras:                                            |");
        System.out.println("| Pedra ganha da tesoura (amassando-a ou quebrando-a)|");
        System.out.println("| tesoura ganha do papel (cortando-o)                |");
        System.out.println("| papel ganha da pedra (embrulhando-a)               |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("Digite seu nome: ");
        String nome = jogar.nextLine();
        int maquina, jogador;
        String nomeMaquina = "Maquina";
        do{
        System.out.print(nome+ ", escolha Pedra (1), Papel (2) ou Tesoura (3): ");
        jogador = jogar.nextInt();
        maquina = (int) (Math.random() * 3 + 1);
        System.out.println(nome+" escolheu: " +jogador);
        System.out.println(nomeMaquina+ " escolheu: " +maquina);
        if(maquina == jogador){
            System.out.println("Empate!");
            System.out.println("Jogue Novamente:");
            System.out.print(nome+ ", escolha Pedra (1), Papel (2) ou Tesoura (3): ");
            jogador = jogar.nextInt();
            maquina = (int) (Math.random() * 3 + 1);
            System.out.println(nome+" escolheu: " +jogador);
            System.out.println(nomeMaquina+ " escolheu: " +maquina);
        }
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
                }
            break;
            default:
                System.out.println("Jogada invalida!");
        }
        } while(jogador == maquina);
     }
}
