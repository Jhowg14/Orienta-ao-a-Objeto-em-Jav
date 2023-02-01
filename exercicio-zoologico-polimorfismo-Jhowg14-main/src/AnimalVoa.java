public class AnimalVoa extends Animal {
    private String qualidadeVoo;

    public AnimalVoa(String nome, String especie, int qntpatas, String som, String qualidadeVoo) {
        super(nome, especie, qntpatas, som);
        this.qualidadeVoo = qualidadeVoo;
    }
    /**
     * @return String return the qualidadeVoo
     */
    public String getQualidadeVoo() {
        return qualidadeVoo;
    }
    @Override
    public String getDescricaoLonga() {
        return super.getDescricaoLonga()+ " e Voa " + getQualidadeVoo();
    }
}