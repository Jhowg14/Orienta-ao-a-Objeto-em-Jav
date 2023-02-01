public class Animal {
    private String nome;
    private String Animal;
    private int qntpatas;
    private String som;

    public Animal(String nome, String Animal, int qntpatas, String som) {
        this.nome = nome;
        this.Animal = Animal;
        this.qntpatas = qntpatas;
        this.som = som;
    }
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return String return the Animal
     */
    public String getAnimal() {
        return Animal;
    }
    /**
     * @return int return the qntpatas
     */
    public int getQntpatas() {
        return qntpatas;
    }
    /**
     * @return String return the som
     */
    public String getSom() {
        return som;
    }
    public String getDescricao() {
        return getNome() + " é um(a) " + getAnimal();
    }
    public String getDescricaoLonga() {
        return getDescricao() + " que faz " + getSom();
    }
}