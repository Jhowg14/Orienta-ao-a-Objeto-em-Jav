package concessionaria;

import fabricaautomoveis.carros.Carro;
import fabricaautomoveis.carros.Categoria;
import fabricaautomoveis.carros.Toro;
import fabricaautomoveis.carros.Marca;
import fabricaautomoveis.carros.Strada;
import fabricaautomoveis.carros.Argo;

public class FiatFactory implements FabricaFactory {
    @Override
    public Carro criarCarro(Marca marcaFranquia, Categoria categoria, String cor) {
        Carro carro = null;
        
        if (marcaFranquia == Marca.FIAT && categoria == Categoria.POPULAR) {
            carro = new Argo(cor);
        }
        else if (marcaFranquia == Marca.FIAT && categoria == Categoria.PICKUP) {
            carro = new Strada(cor);
        }
        else if (marcaFranquia == Marca.FIAT && categoria == Categoria.LUXO) {
            carro = new Toro(cor);
        }
        
        return carro;
    }
}