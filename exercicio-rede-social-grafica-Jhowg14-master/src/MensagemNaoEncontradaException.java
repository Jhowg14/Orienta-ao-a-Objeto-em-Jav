import java.util.NoSuchElementException;

public class MensagemNaoEncontradaException extends NoSuchElementException{
    private int id;
    //A classe deverá ter como atributo o identificador utilizado.

    public MensagemNaoEncontradaException(int id) {
        super("Mensagem não encontrada com o ID "+id);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}

