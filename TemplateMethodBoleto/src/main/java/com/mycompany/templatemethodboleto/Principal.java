/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.templatemethodboleto;

/**
 *
 * @author 05728612148
 */
public class Principal {
    public static void main(String[] args) {
        
        ProcessarBoletos processador = new LeituraRetornoBradesco();

        String nomeArquivo = "src/main/resources/bradesco.csv";
        System.out.println("Lendo arquivo " + nomeArquivo + "\n");

        processador.processar(nomeArquivo);
    }
}
