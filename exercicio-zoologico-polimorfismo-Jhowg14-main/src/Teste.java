public class Teste {
    public static void main(String[] args) {
        Animal animal = new Lobo("Diego","Preto");
        System.out.println(animal.getDescricaoLonga());
        animal = new Galinha("Roberta", "Ruim");
        System.out.println(animal.getDescricaoLonga());
    }

}