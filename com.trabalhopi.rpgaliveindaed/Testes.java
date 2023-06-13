/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalhopi.rpgaliveindead;



/**
 *
 * @author everton.lcsousa
 */
public class Testes extends MecanicasDoJogo {

    /**
     * Teste de metodos da classe mecanica
     * 
     */
    public static void main(String[] args){
        
    

        Batalhas battle = new Batalhas();
        MecanicasDoJogo mecJogo = new MecanicasDoJogo();
        int vida;
        int inteligencia;
        int furtividade;
        int forca;
        int especialUsos;
        int vidaInimigo;
        mecJogo.criaZumbi();
        int forcaMob = mecJogo.getForcaZumbi();
        mecJogo.setClasseSoldado();

        vida = mecJogo.getVida();
        forca = mecJogo.getForca();
        inteligencia = mecJogo.getInteligencia();
        furtividade = mecJogo.getFurtividade();
        especialUsos = mecJogo.getEspecial();
        vidaInimigo = mecJogo.getVidaZumbi();

        System.out.println(vida);
        System.out.println(forca);
        System.out.println(inteligencia);
        System.out.println(furtividade);
        System.out.println(especialUsos);
        System.out.println(vidaInimigo);

        

        System.out.println("Sua vida atual: " + vida + "\nForÃ§a: " + forca + " \nInteligÃªncia: " + inteligencia + "\nFurtividade: " + furtividade);
        mecJogo.adicionarItensNaMochila("Chave");

        mecJogo.mostrarMochila();

        mecJogo.adicionarItensNaMochila("Arma");

        mecJogo.mostrarMochila();
        
        battle.batalha(vida, especialUsos, forca, furtividade, vidaInimigo, forcaMob);
       
        
      
    }
}
