package concessionaria;

import fabricaautomoveis.carros.Camaro;
import fabricaautomoveis.carros.Carro;
import fabricaautomoveis.carros.Categoria;
import fabricaautomoveis.carros.Marca;
import fabricaautomoveis.carros.Onix;
import fabricaautomoveis.carros.S10;

public class ChevroletFactory implements FabricaFactory {
    @Override
    public Carro criarCarro(Marca marcaFranquia, Categoria categoria, String cor) {
        Carro carro = null;
        
        if (marcaFranquia == Marca.CHEVROLET && categoria == Categoria.POPULAR) {
            carro = new Onix(cor);
        }
        else if (marcaFranquia == Marca.CHEVROLET && categoria == Categoria.PICKUP) {
            carro = new S10(cor);
        }
        else if (marcaFranquia == Marca.CHEVROLET && categoria == Categoria.LUXO) {
            carro = new Camaro(cor);
        }
        
        return carro;
    }
}
