package concessionaria;

import fabricaautomoveis.carros.Carro;
import fabricaautomoveis.carros.Categoria;
import fabricaautomoveis.carros.Marca;


interface FabricaFactory {

        public Carro criarCarro(Marca marcaFranquia, Categoria categoria, String cor); 
    }