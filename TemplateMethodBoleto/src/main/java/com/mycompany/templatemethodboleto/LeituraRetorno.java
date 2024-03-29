/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.templatemethodboleto;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author 05728612148
 */
public abstract class LeituraRetorno {
    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    List<Boleto> lerArquivo(String nomeArquivo) ;
 protected abstract Boleto processarLinhaArquivo(String[] vetorLinhaArq);

}