package concessionaria;
import fabricaautomoveis.carros.Carro;
import fabricaautomoveis.carros.Categoria;
import fabricaautomoveis.carros.Gol;
import fabricaautomoveis.carros.Marca;
import fabricaautomoveis.carros.Saveiro;


public class VWFactory implements FabricaFactory{
    @Override
    public Carro criarCarro(Marca marcaFranquia, Categoria categoria, String cor) {
        Carro carro = null;
        
        if (marcaFranquia == Marca.VW && categoria == Categoria.POPULAR) {
            carro = new Gol(cor);
        }
        else if (marcaFranquia == Marca.VW && categoria == Categoria.PICKUP) {
            carro = new Saveiro(cor);
        }
        
        return carro;
    }
}