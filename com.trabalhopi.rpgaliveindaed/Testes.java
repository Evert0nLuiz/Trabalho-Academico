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
        mecJogo.criarInimigo(100, 10);
        int forcaMob = mecJogo.getForcaInimigo();
        mecJogo.setClasseSoldado();

        vida = mecJogo.getVida();
        forca = mecJogo.getForca();
        inteligencia = mecJogo.getInteligencia();
        furtividade = mecJogo.getFurtividade();
        especialUsos = mecJogo.getEspecial();
        vidaInimigo = mecJogo.getVidaInimigo();

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
        
        boolean ganhou = battle.batalha(mecJogo);

        System.out.println("Sua vida atual: " + mecJogo.getVida());

        System.out.println("ganhou? " + ganhou);
        
      
    }
}
