# Sistema de Folha de Pagamento em Java

Sistema de console desenvolvido em Java para gerenciamento de funcionários e cálculo de folha de pagamento, aplicando os principais conceitos de Programação Orientada a Objetos.

Este projeto foi criado com fins de estudo, simulando um sistema real de RH com cadastro de funcionários, cálculo de salários com regras específicas por cargo, controle de horas extras e geração de relatórios.

## Funcionalidades

- Cadastro de três tipos de funcionários: **Gerente**, **Vendedor** e **Estagiário**
- Cálculo de salário com regras de bônus específicas para cada cargo
- Cálculo de bônus por horas extras, com base em uma meta mensal de 220 horas
- Verificação de metas individuais (vendas para o Vendedor, tempo de estudo e projetos para o Estagiário)
- Geração de relatório completo com todos os funcionários cadastrados
- Menu interativo via console, com fluxo de cadastro, processamento e relatório

## Conceitos de POO aplicados

- **Abstração**: a classe `Funcionario` é abstrata e define o contrato que todo funcionário deve seguir
- **Herança**: `Gerente`, `Vendedor` e `Estagiario` estendem `Funcionario`, reaproveitando atributos e comportamentos comuns
- **Polimorfismo**: o método `calculateSalary()` é sobrescrito por cada subclasse com sua própria regra de cálculo, e a lista de funcionários é percorrida de forma polimórfica
- **Encapsulamento**: atributos privados com acesso controlado por getters e setters
- **Separação de responsabilidades**: a interface com o usuário (`InterfaceMenu`) é isolada da lógica de negócio (`Funcionario` e subclasses), e ambas são orquestradas pela `Main`

## Estrutura do projeto

```
src
├── Main.java
└── io.github.joaojps
    ├── funcionarios
    │   ├── Funcionario.java   (classe abstrata)
    │   ├── Gerente.java
    │   ├── Vendedor.java
    │   └── Estagiario.java
    └── menu
        └── InterfaceMenu.java
```

## Regras de cálculo

| Cargo | Regra de bônus |
|---|---|
| Gerente | Bônus adicional sobre o salário base |
| Vendedor | Comissão calculada sobre o total de vendas |
| Estagiário | Salário base, com verificação de metas de estudo e projetos |
| Todos | Bônus por hora extra quando as horas trabalhadas no mês ultrapassam 220h |

## Como executar

Pré-requisito: ter o Java (JDK) instalado.

```bash
git clone https://github.com/joao-jps/sistema-folha-de-pagamento-java.git
cd sistema-folha-de-pagamento-java/src
javac Main.java io/github/joaojps/funcionarios/*.java io/github/joaojps/menu/*.java
java Main
```

Ou, se preferir, basta abrir o projeto em uma IDE (como IntelliJ IDEA) e rodar a classe `Main`.

## Próximos passos

- Extrair a lógica de negócio da `Main` para uma classe `SistemaFolhaPagamento`
- Implementar o pacote `metas`, com verificação de metas específicas por cargo
- Persistência de dados (arquivo ou banco de dados), já que hoje os dados existem apenas em memória durante a execução

## Autor

**João** — [GitHub](https://github.com/joao-jps) · [LinkedIn](https://www.linkedin.com/in/joaojps/)
