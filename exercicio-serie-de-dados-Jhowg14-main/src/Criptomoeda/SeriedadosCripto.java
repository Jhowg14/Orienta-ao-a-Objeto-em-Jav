package Criptomoeda;
import series.SerieDados;
import java.util.HashMap;

public abstract class SeriedadosCripto implements SerieDados{
    private String localidade;
    private int diaInicial;
    private int diaFinal;
    private HashMap<Integer, Double> dados;

    public SeriedadosCripto(String localidade, int diaInicial, int diaFinal) {
        this.localidade = localidade;
        this.diaInicial = diaInicial;
        this.diaFinal = diaFinal;
        this.dados = new HashMap<Integer, Double>();
    }
    /**
     * Retorna o primeiro dia para o qual a série tem dados. Exemplo: dia 5.
     * Considera-se que a série tem dados para todos os dias desde o dia inicial
     * até o dia final.
     * 
     * @return O primeiro dia que possui dados.
     */
    @Override
    public int obterDiaInicial() {
        return this.diaInicial;
    }
    /**
     * Retorna o último dia para o qual a série tem dados. Exemplo: dia 21.
     * Considera-se que a série tem dados para todos os dias desde o dia inicial
     * até o dia final.
     * 
     * @return O último dia que possui dados.
     */
    @Override
    public int obterDiaFinal() {
        return this.diaFinal;
    }
    /**
     * Retorna o dado correspondente a um dia da série de dados.
     * Obs: seria mais eficiente o retorno de um conjunto de dados, mas está
     * assim por motivos didáticos.
     * 
     * @param dia Dia para o qual se deseja obter o dado correspondente.
     */
    @Override
    public int obterDado(int dia) {
        return this.dados.get(dia).intValue();
    }

    public void adicionar(int dia, double valor) {
        if(dia >= this.diaInicial && dia <= this.diaFinal) {
            this.dados.put(dia, valor);
        }
    }
    public String getLocalidade() {
        return this.localidade;
    }

    public abstract String obterIdentificacaoSerie();
}
    