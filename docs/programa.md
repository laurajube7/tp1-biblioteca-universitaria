# 4. Programa Standalone Inicial

O programa fica em `src/Main.java`. É um programa de console que usa só variáveis de tipos primitivos (`int`, `double`), operadores e controle de fluxo (`if/else` e `do-while`), sem classes próprias.

Ele tem um menu com duas opções:

- **1 – Verificar se pode fazer empréstimo:** pergunta quantos empréstimos ativos o membro tem e diz se ele pode pegar mais um (limite de 3).
- **2 – Calcular multa de devolução:** pergunta quantos dias o membro ficou com o livro. Se passou de 14 dias, calcula os dias de atraso e a multa de R$ 1,00 por dia.

O menu repete até o usuário digitar 0.

**Exemplo de execução:**

```
Opção: 2
Quantos dias o membro ficou com o livro? 19
Devolução com 5 dia(s) de atraso.
Multa: R$ 5,00
```

**Como executar:** abrir o projeto no IntelliJ IDEA com o JDK 21 configurado, abrir `src/Main.java` e clicar em Run.
