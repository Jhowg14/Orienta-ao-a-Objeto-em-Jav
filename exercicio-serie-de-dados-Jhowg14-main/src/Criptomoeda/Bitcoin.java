package Criptomoeda;

public class Bitcoin extends SeriedadosCripto {
    
    public Bitcoin(String localidade, int diaInicial, int diaFinal) {
        super(localidade, diaInicial, diaFinal);
    }

    /*/**
     * Retorna uma string que representa o nome ou a identificação da série de
     * dados diários em questão.
     * 
     * @return Nome ou identificação da série de dados
     */
    @Override
    public String obterIdentificacaoSerie(){
        return "Bitcoin comprado "+getLocalidade();
    }
}
