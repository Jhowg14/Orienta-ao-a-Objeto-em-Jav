package Criptomoeda;

import java.util.ArrayList;
import java.util.List;

import series.ControladorSeries;
import series.SerieDados;

public class Controle implements ControladorSeries{
    private List<SerieDados> series;

    /**
     * 
     */
    public Controle(){
        this.series = new  ArrayList<>();
        SeriedadosCripto ether= new Ethereum("Brazil", 1, 10);
        SeriedadosCripto btc = new Bitcoin("EUA", 1, 10);
        this.series.add(ether);
        for (int i = 1; i <= 10 ; i++) {
            ether.adicionar(i, i*i);
        }
        this.series.add(btc);
        for (int i = 1; i <= 10; i++) {
            ((Bitcoin)this.series.get(1)).adicionar(i, i*2);
        }
    }
    @Override
    public List<SerieDados> obterSeriesDados() {
        return this.series;
    }
}