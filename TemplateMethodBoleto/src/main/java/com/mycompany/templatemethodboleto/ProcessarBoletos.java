package com.manoelcampos.retornoboleto;

import java.util.List;

public abstract class ProcessarBoletos {
    public final List<Boleto> processar(String nomeArquivo){
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String line;
            List<Boleto> boletos = new ArrayList<>();
            while((line = reader.readLine()) != null){
                String[] vetor = line.split(";");
                Boleto boleto = processasrLinhaArquivo(vetor);
                boletos.add(boleto);
                System.out.println(boleto);
        }
        return boletos;
    }catch (IOException e) {
            throw new UncheckedIOException(e);
        }
}

    protected abstract Boleto processarLinhaArquivo(String[] vetorLinhaArq);
}