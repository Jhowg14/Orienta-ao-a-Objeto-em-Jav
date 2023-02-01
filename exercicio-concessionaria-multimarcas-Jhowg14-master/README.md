[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=8298769&assignment_repo_type=AssignmentRepo)
# Concessionária Multimarcas

Este projeto é utilizado em exercícios sobre Padrões de Projeto em disciplinas de Programação Orientada a Objetos.

## Passo 1

Execute o programa implementado neste projeto e teste todas as suas opções.

Estude o projeto e veja que ele possui uma superclasse chamada `Carro` e subclasses para cada modelo de carro.
Ele também possui uma classe `Concessionaria`, que é a principal classe de regra de negócio do sistema, e que
permite que o usuário compre um carro.

Em seguida, mude a marca da franquia da `Concessionaria`, alterando a chamada do seu construtor, e teste o programa novamente.

## Passo 2

No passo anterior, vimos que a classe `Concessionaria` não tem os carros de todas as categorias para a Marca VW.

Faça as alterações necessárias para que a classe `Concessionaria` consiga entregar modelos de Saveiro (Pickup da VW).
Por enquanto não trate os carros de luxo.

O que você achou das mudanças no código?

Teve que ser criada uma nova classe para representar o Saveiro, e teve que alterar o metodo comprarcarro()
na classe Concessionaria para que ele possa entregar o Saveiro. Acho que não seria o ideal ficar mundando a
classe Concessionaria sempre que adicionar uma novo modelo de carro.

O que aconteceria se o carro popular da VW passasse a ser o UP!
Que partes do código precisariam ser alteradas?

Teriamos que Criar uma classe para UP e colocar ele como popular, teriamos que alterar o metodo comprarcarro() na classe Concessionaria para 
que ele possa entregar o UP.  

O que aconteceria se quiséssemos agora comprar carros da Chevrolet?
Que partes do código precisariam ser alteradas?

Teria que alterar a classe Marca e teríamos que fazer ainda mais modificações na classe `Concessionaria` para 
para produzir carros da Chevrolet. Teremos que mexer nesse trecho de código que estava pronto e testado. E é o que
sempre queremos evitar.


## Passo 3

Veja que no passo anterior, nós acabamos mudando o código da classe `Concessionaria` para produzir carros diferentes.
Isso está acontecendo porque nossa classe está dependendo de classes concretas (ou seja, depende da criação de objetos de tipos específicos).

Seguindo os _Princípios de Design_ que aprendemos, o ideal é que nossas classes sejam _abertas para extensão e fechadas para modificação_.
Se nós quiséssemos tratar uma nova marca (Chevrolet, por exemplo) teríamos que fazer ainda mais modificações na classe `Concessionaria`.

Na aula teórica vimos que o **Padrão de Projeto Abstract Factory** é muito útil nessas situações.
Com ele, nós poderemos criar carros de tipos diferentes, inclusive de marcas diferentes, sem precisarmos alterar o código da classe `Concessionaria` a cada novo modelo de carro.

Faça então uma modelagem UML das alterações necessárias para implementar o Padrão de Projeto Abstract Factory, considerando duas fábricas concretas: VW e Fiat.
Exporte a modelagem para o formato `png`e coloque o arquivo em uma pasta `doc` dentro da pasta principal do projeto, 

Dica: use um software de desenho qualquer para fazer a modelagem (preocupe-se apenas com uma visão geral das classes e dos métodos principais necessários).

## Passo 4

Faça a implementação de acordo com a modelagem do exercício anterior.
Crie as classes necessárias para tratar as marcas VW e Fiat.
Teste suas alterações.

O que aconteceria agora se o carro popular da VW passasse a ser o UP! 
A classe Concessionaria precisaria ser alterada?

A classe Concessionaria não precisaria ser alterada, bata alterar a classe VWFactory ser preparada para produzir UP. E criar uma classe UP.

O que aconteceria agora se quiséssemos agora comprar carros da Chevrolet?
Quais partes do código precisariam ser alteradas?

Seria necessario criar uma classe ChevroletFactory e herdar da interface FabricaFactory alem de criar as classes dos carros e extender da classe Carro, precisaria alterar a classe interfaceUsario para criar uma concessionaria com fabrica e marca da ChevroletFactory.É preciso adicionar a marca Chevrolet na classe Marca.

## Passo 5

Faça agora as alterações necessárias para que nossa concessionária possa vender carros da Chevrolet.

Quais mudanças foram necessárias na classe `Concessionaria`?

Nenhuma, pois a classe Concessionaria não depende mais de classes concretas, ela depende de uma interface.

## Passo 6

Veja que com a utilização do Padrão de Projeto Abstract Factory nós ganhamos a possibilidade de até mudarmos a marca da franquia _em tempo de execução_, caso necessário.

Crie então na classe `Concessionaria` a opção de mudar a marca da franquia e faça os tratamentos necessários.

Adicione uma opção de menu _Mudar Franquia_ na interface do usuário, que permite que ele mude a franquia da concessionária.
Teste seu programa comprando carros de uma franquia, e depois mude a franquia e compre novos carros.

O que achou das alterações? Tente comparar como isso seria feito com o código inicial do Passo 1.

Acho que ficou bem mais simples de alterar a marca da franquia, pois não precisamos alterar a classe Concessionaria, apenas a classe interfaceUsuario. No código inicial do Passo 1, teriamos que alterar a classe Concessionaria para mudar a marca da franquia não permitia que as classes sejam facilmente estendidas, para incorporar novos comportamentos, sem modificar o código existente.
