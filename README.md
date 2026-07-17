# Padrões de Projeto

 ## 1. Padrões Criacionais (Creational)
 
Esses padrões abstraem o processo de instanciação (criação) de objetos. Eles ajudam a tornar um sistema independente de como seus objetos são criados, compostos e representados.

**Singleton:** Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.  

**Factory Method:** Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar.  

**Abstract Factory:** Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.  

**Builder:** Separa a construção de um objeto complexo da sua representação, de modo que o mesmo processo de construção possa criar diferentes representações.

**Prototype:** Especifica os tipos de objetos a serem criados usando uma instância-protótipo e cria novos objetos copiando este protótipo.

## 2. Padrões Estruturais (Structural)

Esses padrões lidam com a composição de classes ou objetos para formar estruturas maiores e mais complexas, mantendo essas estruturas flexíveis e eficientes.

**Adapter:** Converte a interface de uma classe em outra interface esperada pelos clientes, permitindo que classes com interfaces incompatíveis trabalhem juntas.

**Bridge:** Separa uma abstração da sua implementação, de modo que as duas possam variar independentemente.

**Composite:** Compõe objetos em estruturas de árvore para representar hierarquias do tipo "parte-todo", permitindo que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.

**Decorator:** Dinamicamente adiciona responsabilidades (comportamentos) adicionais a um objeto de forma flexível.

**Facade:** Fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema mais complexo.

**Flyweight:** Usa compartilhamento para suportar eficientemente grandes quantidades de objetos de formato fino (evitando alto consumo de memória).

**Proxy:** Fornece um objeto substituto ou marcador de posição para outro objeto para controlar o acesso a ele.

## 3. Padrões Comportamentais (Behavioral)

Esses padrões concentram-se nos algoritmos e na atribuição de responsabilidades entre os objetos. Eles não descrevem apenas os padrões de objetos ou classes, mas também os padrões de comunicação entre eles.  

**Chain of Responsibility:** Evita o acoplamento do remetente de uma solicitação ao seu receptor, dando a mais de um objeto a chance de tratar a solicitação.  

**Command:** Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar solicitações e suportar operações que podem ser desfeitas.  

**Interpreter:** Dada uma linguagem, define uma representação para sua gramática juntamente com um interpretador que usa a representação para interpretar sentenças na linguagem.

**Iterator:** Fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado (como uma lista) sem expor sua representação subjacente.

**Mediator:** Define um objeto que encapsula como um conjunto de objetos interage, promovendo o acoplamento fraco ao evitar que os objetos se refiram uns aos outros explicitamente.

**Memento:** Sem violar o encapsulamento, captura e externaliza o estado interno de um objeto, permitindo que o objeto seja restaurado para este estado mais tarde (como um "Ctrl+Z").

**Observer:** Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.  

**State:** Permite que um objeto altere seu comportamento quando seu estado interno muda, parecendo que o objeto mudou de classe.  

**Strategy:** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis, permitindo que o algoritmo varie independentemente dos clientes que o utilizam.  

**Template Method:** Define o esqueleto de um algoritmo em uma operação, adiando a implementação de alguns passos para as subclasses.  

**Visitor:** Representa uma operação a ser executada nos elementos da estrutura de um objeto, permitindo definir uma nova operação sem alterar as classes dos elementos sobre os quais opera.
