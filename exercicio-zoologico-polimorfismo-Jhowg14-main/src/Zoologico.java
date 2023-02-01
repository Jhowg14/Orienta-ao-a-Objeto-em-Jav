import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;
    
    public Zoologico() {
        this.animais = new ArrayList<Animal>();
    }

    public void cadastrarLobo(String nome,String cor) {
        Lobo lobo = new Lobo(nome, cor);
        this.animais.add(lobo);
    }
    public void cadastrarGato(String nome,String cor) {
        Gato gato = new Gato(nome, cor);
        this.animais.add(gato);
    }
    public void cadastrarAguia(String nome,String qualidadeVoo) {
        Aguia aguia = new Aguia(nome, qualidadeVoo);
        this.animais.add(aguia);
    }
    public void cadastrarGalinha(String nome,String qualidadeVoo) {
        Galinha galinha = new Galinha(nome, qualidadeVoo);
        this.animais.add(galinha);
    }
    //Método que recebe o nome de um animal e retorna sua descrição longa.
    public String getDescricaoAnimal(String nome) {
        String descricao = "";
        for(Animal animal : this.animais) {
            if(animal.getNome().equals(nome)) {
                descricao = animal.getDescricaoLonga();
            }
        }
        return descricao;

    }
    //Método que lista a descrição de todos os animais do zoológico.
    public String listarAnimais() {
        String lista = "";
        for(Animal animal : this.animais) {
            lista += animal.getDescricao() + "\n";
        }
        return lista;
    }
    //Método que lista a descrição longa de todos os animais do zoológico.
    public String listarAnimaisLonga() {
        String lista = "";
        for(Animal animal : this.animais) {
            lista += animal.getDescricaoLonga() + "\n";
        }
        return lista;
    }
}
