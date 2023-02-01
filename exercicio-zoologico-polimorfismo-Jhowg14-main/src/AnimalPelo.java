public class AnimalPelo extends Animal{
    private String cor;

    public AnimalPelo(String nome, String Animal, int qntpatas, String som, String cor) {
        super(nome, Animal, qntpatas, som);
        this.cor = cor;
    }
    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }
    
    @Override
    public String getDescricaoLonga() {
        return super.getDescricaoLonga()+ " e tem pelo " + getCor();
    }

}