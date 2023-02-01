import java.util.List;

import Criptomoeda.Controle;
import series.SerieDados;
import series.VisualizadorSeries;

public class Principal {
    /**
     * 
     */
    public void executar() {
        Controle controle = new Controle();
        List<SerieDados> series = controle.obterSeriesDados();
        VisualizadorSeries visualizador = new VisualizadorSeries(series); 
        visualizador.exibir();
        for (SerieDados serie : series) {
            System.out.println("Dados da Serie "+serie.obterIdentificacaoSerie());
            for (int i = serie.obterDiaInicial(); i <= serie.obterDiaFinal(); i++) {
                System.out.println("Dia "+ i + ": " + serie.obterDado(i));
            }
        }
    }

}
