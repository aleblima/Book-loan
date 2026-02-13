<div align="center">
<img src="assets/header.gif" width="100%">

# Empréstimo de livros
![Java21](https://img.shields.io/badge/Java-21-red?style=plastic)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=plastic&logo=intellij-idea&logoColor=white)
![Static Badge](https://img.shields.io/badge/POO-passing?style=plastic)
</div>

## Descrição
  projeto para práticar os fundamentos de **POO** e concluir a atividade do 
  programa IRede.


## ⚙️ Funcionalidades
### 🏗️ Entidades:
* **Livro:** título, autor, disponível (boolean)
* **Usuario (classe abstrata):** nome, email
* **Aluno e Professor** (herdam de Usuario)

### 🚀 O sistema deve permitir:
- [X] Listar livros disponíveis
- [ ] Empréstimo de livro
  - *Lançar exceção caso o livro não esteja disponível*
- [ ] Devolução de livro

___
## 🛠️ Tecnologias e Conceitos Aplicados
* **Encapsulamento:** Proteção de dados com getters/setters.
* **Herança e Polimorfismo:** Especialização de usuários.
* **Tratamento de Exceções:** Robustez no fluxo de empréstimo.

### 📦 Pacotes sugeridos:
- model → classes Livro, Usuario, Aluno, Professor
- service → lógica de empréstimo e devolução
- exceptions → LivroIndisponivelException


- pacote principal, você pode nomear com main ou como decidir → classe com método main que executa o sistema
___
### 🍃 Dica de fluxo para cuiar os alunos:
- [ ] Criar as classes do pacote model
- [ ] Criar a exceção customizada
- [ ] Criar o serviço de empréstimo (BibliotecaService
#### ✨ Dica final: Priorize a clareza do código e simule um fluxo simples, mas completo. 