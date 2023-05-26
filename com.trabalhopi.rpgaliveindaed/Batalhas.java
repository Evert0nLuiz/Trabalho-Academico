package com.trabalhopi.rpgaliveindead;
import java.util.Random;
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

public int batalha(int vidaJogador, int especialUsos,int forcaJogador, int vidaInimigo, int forcaMob){
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();
    int especial = especialUsos;
    int vidaMob = vidaInimigo;
    forcaJogador = rnd.nextInt(forcaJogador)+1;
    int escolhaInimigo;
    int escolhaOqFazerJogador;
    int especialDamage = rnd.nextInt(forcaJogador)+1;

    while(vidaJogador > 0 && vidaInimigo > 0)
    {
        System.out.println(forcaZumbi);
        escolhaOqFazerJogador = imprimeHP(vidaJogador, especialUsos, vidaMob);
        if(vidaJogador < 0)
        {
        if(escolhaOqFazerJogador == 0){
            break;
        }
        
         switch(escolhaOqFazerJogador){
                case 0:
                    //ataque normal            
                    vidaMob -= forcaJogador;
                break;
                case 1:
                    //ataque especial
                    vidaMob -= especialDamage;
                    especialUsos -= 1;
                break;
                case 2:
                    if (furtividade >= 8)
                    {
                        continue;
                    }
                break;
            
        }
    }
         if(vidaInimigo > 0)
        {
            escolhaInimigo = rnd.nextInt(1)+ 1 ;
            switch(escolhaInimigo){
                case 1:
                    //ataque normal            
                    vidaJogador -= rnd.nextInt(forcaMob);
                break;
                 case 2:
                //ataque especial
                    vidaJogador -= rnd.nextInt(forcaMob)*10;
                break;
           
    }
    

         }


    }
    return vidaJogador;

}
}
