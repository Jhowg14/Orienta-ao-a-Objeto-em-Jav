/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

import fabricaautomoveis.carros.Categoria;
import fabricaautomoveis.carros.Marca;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class InterfaceUsuario {

    private Concessionaria ppooVeiculos;
    private Scanner entrada;
        
    public void exibir() {
        //Crie então na classe `Concessionaria` a opção de mudar a marca da franquia e faça os tratamentos necessários.

       //Adicione uma opção de menu _Mudar Franquia_ na interface do usuário, que permite que ele mude a franquia da concessionária.
       //Adicione uma opção de menu _Mudar Fanquia
        ppooVeiculos = new Concessionaria("PPOO Veículos", Marca.CHEVROLET, new ChevroletFactory());
        entrada = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1 - Comprar carro "+ ppooVeiculos.getMarcaFranquia());
            System.out.println("2 - Mudar franquia");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    comprarCarro();
                    break;
                case 2:
                    mudarFranquia();
                    break;
                case 3:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }
        
    

        private void mudarFranquia() {
            int opcao = 0;
                System.out.println("1 - Chevrolet");
                System.out.println("2 - Fiat");
                System.out.println("3 - VW");
                System.out.print("Opção: ");
                opcao = entrada.nextInt();
                entrada.nextLine();
                switch (opcao) {
                    case 1:
                        ppooVeiculos.mudarFranquia(Marca.CHEVROLET, new ChevroletFactory());
                        break;
                    case 2:
                        ppooVeiculos.mudarFranquia(Marca.FIAT, new FiatFactory());
                        break;
                    case 3:
                        ppooVeiculos.mudarFranquia(Marca.VW, new VWFactory());
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
        }

        private void comprarCarro(){        
            System.out.println("Concessionaria vende carros da: " + ppooVeiculos.getMarcaFranquia());        
        
            System.out.print("Escolha a categoria (1: Popular, 2: Pickup ou 3: Luxo): ");
            Categoria categoria = Categoria.peloID(Integer.parseInt(entrada.nextLine()));
        
            System.out.print("Escolha a cor: ");
            String cor = entrada.nextLine();
        
            if (ppooVeiculos.comprarCarro(categoria, cor)) {
                System.out.println("Parabéns!!! O carro é seu!!!");            
            }
            else {
                System.out.println("Sinto muito, não quer escolher outro?");
            }
        
            esperarTecla();
        }
    
        private void esperarTecla() {
            entrada.nextLine();
        }
}

