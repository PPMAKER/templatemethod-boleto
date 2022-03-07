package com.manoelcampos.retornoboleto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBancoBrasil implements LeituraRetorno {

    @Override
        protected Boleto processarLinhaArquivo(String[] vetorLinhaArq){
            Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
                boleto.setCodBanco(vetorLinhaArq[1]);
                
                boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[2], FORMATO_DATA));
                boleto.setDataPagamento(LocalDate.parse(vetorLinhaArq[3], FORMATO_DATA).atTime(0, 0, 0));

                boleto.setCpfCliente(vetorLinhaArq[4]);
                boleto.setValor(Double.parseDouble(vetorLinhaArq[5]));
                boleto.setMulta(Double.parseDouble(vetorLinhaArq[6]));
                boleto.setJuros(Double.parseDouble(vetorLinhaArq[7]));

                return boleto;
    }
}