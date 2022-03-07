package com.manoelcampos.retornoboleto;

import java.util.List;

public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;
    
    public ProcessadorBoletos(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
    public final List<Boleto> processar(String nomeArquivo){
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String line;
            List<Boleto> boletos = new ArrayList<>();
            while((line = reader.readLine()) != null){
                String[] vetor = line.split(";");
                Boleto boleto = leituraRetorno.processasrLinhaArquivo(vetor);
                boletos.add(boleto);
                System.out.println(boleto);
        }
        return boletos;
    }catch (IOException e) {
            throw new UncheckedIOException(e);
        }
}

}