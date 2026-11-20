# 1. Documento de Requisitos

## 1.1 Visão geral

O sistema vai controlar o acervo de uma biblioteca universitária: livros, exemplares, membros, empréstimos, devoluções, reservas e multas por atraso. A ideia é organizar a circulação dos exemplares e fazer com que as regras da biblioteca sejam cumpridas.

## 1.2 Atores

- **Membro:** aluno, professor ou funcionário com cadastro na biblioteca. Pode consultar o acervo, ver a disponibilidade dos livros, pedir empréstimos e devoluções e fazer reservas.
- **Bibliotecário/Administrador:** cadastra e mantém o acervo e os membros, processa empréstimos e devoluções, gerencia as reservas e controla as multas.

## 1.3 Entidades principais

| Entidade | Dados |
|----------|-------|
| Livro | título, autor, ISBN |
| Exemplar | código de patrimônio, estado de conservação, livro |
| Membro | nome, matrícula, tipo (aluno, professor ou funcionário) |
| Empréstimo | exemplar, membro, data de retirada, prazo de devolução, data de devolução |
| Reserva | livro, membro, data da reserva |
| Multa | membro, empréstimo, valor, situação do pagamento |

## 1.4 Requisitos funcionais

| ID | Descrição | Ator |
|----|-----------|------|
| RF01 | Cadastrar, consultar, alterar e remover livros. | Bibliotecário |
| RF02 | Cadastrar, consultar, alterar e remover exemplares, incluindo o estado de conservação. | Bibliotecário |
| RF03 | Cadastrar, consultar, alterar e remover membros. | Bibliotecário |
| RF04 | Pesquisar livros no acervo por título, autor ou ISBN. | Membro, Bibliotecário |
| RF05 | Mostrar quantos exemplares de um livro estão disponíveis. | Membro, Bibliotecário |
| RF06 | Registrar um empréstimo com prazo de devolução de 14 dias corridos a partir da retirada. | Bibliotecário |
| RF07 | Não permitir que um membro tenha mais de 3 empréstimos ativos ao mesmo tempo. | Sistema |
| RF08 | Só emprestar exemplares disponíveis e em bom estado (nem emprestados, nem danificados). | Sistema |
| RF09 | Registrar a devolução, encerrando o empréstimo e guardando a data em que ocorreu. | Bibliotecário |
| RF10 | Calcular a multa quando a devolução for feita depois do prazo, por dia corrido de atraso, e vincular ao membro. | Sistema |
| RF11 | Permitir que o membro reserve um livro somente se houver exemplares dele emprestados. | Membro |
| RF12 | Registrar o pagamento de multas. | Bibliotecário |
| RF13 | Só permitir empréstimos e reservas para membros com cadastro válido. | Sistema |

## 1.5 Requisitos não funcionais

| ID | Tipo | Descrição |
|----|------|-----------|
| RNF01 | Usabilidade | O sistema deve estar em português, com datas no formato dd/mm/aaaa e valores em reais. |
| RNF02 | Usabilidade | Quando uma operação for recusada, o sistema deve mostrar o motivo (por exemplo, "limite de empréstimos atingido"). |
| RNF03 | Segurança | Apenas o bibliotecário pode cadastrar, alterar e remover registros e gerenciar multas. |
| RNF04 | Desempenho | As consultas ao acervo devem responder em poucos segundos. |
| RNF05 | Restrição técnica | O sistema deve ser desenvolvido em Java (JDK 21) no IntelliJ IDEA e, nas próximas etapas, com Spring Boot. |
