# 3. Justificativa de Escopo

## 3.1 O que entrou no TP1

Neste primeiro TP, foquei em entender o problema antes de programar. Por isso, o trabalho tem:

- o levantamento dos requisitos funcionais e não funcionais do sistema;
- o diagrama de casos de uso com os dois atores;
- a descrição dos três cenários principais: empréstimo, devolução e reserva. Escolhi esses três porque são onde estão a maioria das regras de negócio (prazo, limite de empréstimos, multa e reserva);
- a configuração do ambiente (JDK 21 e IntelliJ IDEA) e um programa simples em Java.

O programa ainda não usa orientação a objetos, como pede o enunciado. Ele só calcula o prazo de devolução e a multa por atraso, usando variáveis, operadores, `if` e laços.

## 3.2 O que ficou para depois

- Classes como Livro, Membro e Empréstimo (orientação a objetos);
- salvar os dados em banco de dados;
- a API com Spring Boot;
- login e controle de acesso;
- descrever em detalhes os casos de uso de cadastro (livros, membros e multas), que são mais simples.

## 3.3 Suposições

Algumas coisas não estavam claras na especificação, então considerei o seguinte:

1. **Valor da multa:** a especificação não diz o valor. Usei R$ 1,00 por dia de atraso.
2. **Devolução no dia do prazo:** não gera multa. Só conta atraso a partir do dia seguinte.
3. **Tipos de membro:** aluno, professor e funcionário seguem as mesmas regras (14 dias e até 3 empréstimos), porque a especificação não diferencia.
4. **Multa pendente:** considerei que um membro com multa pendente ainda pode fazer empréstimos, porque a especificação não proíbe. Vou confirmar com o professor.
5. **Reserva:** o mesmo membro não pode reservar o mesmo livro duas vezes.

## 3.4 Ambiente

- Java JDK 21 (Eclipse Temurin 21)
- IntelliJ IDEA Community Edition
- Repositório no GitHub

## 3.5 Uso de IA

Usei o Claude (IA) para me ajudar a organizar e escrever os requisitos, os casos de uso e o programa inicial a partir da especificação do professor. Depois revisei o conteúdo, executei e testei o programa no meu ambiente (IntelliJ com JDK 21).
