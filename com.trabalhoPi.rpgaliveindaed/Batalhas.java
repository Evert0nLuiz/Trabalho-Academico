package com.mycompany.rpgaliveindead;

import javax.swing.*;
import java.util.Scanner;

public class Batalhas extends com.trabalhopi.rpgaliveindead.MecanicasDoJogo {

    public int imprimeHP(int vidaJogador, int especialUsos, int vidaInimigo){
        int escolhaJogador;
        String [] acoesJogador = {"Socar", "Especial", "Fugir"};


        escolhaJogador = JOptionPane.showOptionDialog(null, "Hp: " + vidaJogador + "             Hp Inimigo: " + vidaInimigo + "\nEspecial: "+ especialUsos
        ,"Teste"
        ,JOptionPane.YES_NO_CANCEL_OPTION
        , JOptionPane.WARNING_MESSAGE
        ,null
        ,acoesJogador
        ,0);
        return escolhaJogador;
    }

public void batalha(int vidaJogador, int especialUsos, int vidaInimigo){
    Scanner input = new Scanner(System.in);
    
    int escolhaOqFazerJogador;

    while(vidaJogador > 0 && vidaInimigo > 0)
    {
        escolhaOqFazerJogador = imprimeHP(vidaJogador, especialUsos, vidaInimigo);
        
        switch(escolhaOqFazerJogador){
            case 0:
            damage(3);
            break;
            case 1:
            break;
            case 2:
            break;
            default:
            break;
        }
        break;
        
    }



}

}
