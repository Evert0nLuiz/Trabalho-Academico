/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalhopi.rpgaliveindead;

import com.mycompany.rpgaliveindead.Batalhas;

/**
 *
 * @author everton.lcsousa
 */
public class Testes extends MecanicasDoJogo {

    /**
     * Teste de metodos da classe mecanica
     * 
     */
    public static void main(String [] args){
        
    

        Batalhas battle = new Batalhas();
        MecanicasDoJogo cientista = new MecanicasDoJogo();
        int vida;
        int inteligencia;
        int furtividade;
        int forca;
        int especialUsos;
        int vidaInimigo;
        cientista.setClasseSoldado();

        vida = cientista.getVida();
        forca = cientista.getForca();
        inteligencia = cientista.getInteligencia();
        furtividade = cientista.getFurtividade();
        especialUsos = cientista.getEspecial();
        vidaInimigo = cientista.criaZumbi();
        

        System.out.println("Sua vida atual: " + vida + "\nForÃ§a: " + forca + " \nInteligÃªncia: " + inteligencia + "\nFurtividade: " + furtividade);
        cientista.adicionarItensNaMochila("Chave");
        
        cientista.mostrarMochila();
        
        cientista.adicionarItensNaMochila("Arma");

        cientista.mostrarMochila();
        
        battle.batalha(vida, especialUsos, vidaInimigo);
       
      
    }
}