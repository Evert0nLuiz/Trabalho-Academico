package com.mycompany.rpgaliveindead;

import javax.swing.*;
import java.util.Scanner;

public class Batalhas extends com.trabalhopi.rpgaliveindead.MecanicasDoJogo {

    public void imprimeHP(int vidaJogador, int especialUsos, int vidaInimigo){
        String [] acoesJogador = {"Socar", "Especial", "Fugir"};


        JOptionPane.showConfirmDialog(null,"Hp: " + vidaJogador + "        Hp Inimigo: " + vidaInimigo + "\nEspecial: "+ especialUsos );

    }

public void  batalha(int vidaJogador, int especialUsos, int vidaInimigo){
    Scanner input = new Scanner(System.in);

    int escolhaOqFazerJogador;
    while(vidaJogador > 0 && vidaInimigo > 0)
    {

        while (vidaJogador < 0)
        {

        }
    }



}

}
