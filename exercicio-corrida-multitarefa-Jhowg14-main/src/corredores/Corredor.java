package corredores;
public class Corredor implements Competidor{
    private String nome;
    private int velocidade;
    private int distancia;
    private int  distanciaPercorrida;
    private boolean correndo;
    
    // O construtor da classe deve receber o nome e a velocidade do corredor, pois a ideia é que tenhamos diferentes corredores com diferentes velocidades.
    public Corredor(String nome, int velocidade){
        this.nome = nome;
        this.velocidade = velocidade;
        this.distancia = 0;
        this.distanciaPercorrida = 0;
        this.correndo = false;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    @Override
    public boolean estaCorrendo() {
        return correndo;
    }

    @Override
    public void prepararParaNovaCorrida(int distanciaDaCorrida) {
        this.distancia = distanciaDaCorrida;
        this.distanciaPercorrida = 0;
        this.correndo = false;
    }


//faz o corredor correr mais um metro,
//e suspende a thread pelo tempo necessário que simule a velocidade do corredor.
//Por exemplo: se a velocidade do corredor for de 4 metros por segundo, significa que ele corre um metro a cada 1/4 segundo (ou 250 milissegundos). Logo, este é o tempo que a thread deveria ser suspensa neste caso.
    @Override
    public void run() {
        this.correndo = true;
        // suspende a thread pelo tempo necessário que simule a velocidade do corredor.
        while(this.distanciaPercorrida < this.distancia){
            this.distanciaPercorrida++;
            try {
                //System.out.println(nome+" "+ distanciaPercorrida+" "+ 1/velocidade);
                //int tempo = 1/1000 velocidade;
                Thread.sleep(1000/velocidade);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.correndo = false;
    }
        
}
