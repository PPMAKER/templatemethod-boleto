package com.manoelcampos.retornoboleto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno {

    @Override
        protected Boleto processarLinhaArquivo(String[] vetorLinhaArq){
            Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
                boleto.setCodBanco(vetorLinhaArq[1]);
                boleto.setAgencia(vetorLinhaArq[2]);
                boleto.setContaBancaria(vetorLinhaArq[3]);
                
                boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[4], FORMATO_DATA));
                boleto.setDataPagamento(LocalDateTime
                        .parse(vetorLinhaArq[5], FORMATO_DATA_HORA));
                boleto.setCpfCliente(vetorLinhaArq[6]);
                boleto.setValor(Double.parseDouble(vetorLinhaArq[7]));
                boleto.setMulta(Double.parseDouble(vetorLinhaArq[8]));
                boleto.setJuros(Double.parseDouble(vetorLinhaArq[9]));
                

                return boleto;
    }
}