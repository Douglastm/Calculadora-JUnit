# 🧮 Calculadora Modular com Testes de Integração

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange)
![JUnit](https://img.shields.io/badge/JUnit-5.10-green)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![Status](https://img.shields.io/badge/Status-Concluído-success)

Projeto desenvolvido para a disciplina de **Teste e Qualidade de Software**, com foco na implementação de uma calculadora modular e validação da comunicação entre módulos através de **Testes de Integração**.

</div>

---

# 📋 Sobre o Projeto

Este projeto implementa uma calculadora contendo as quatro operações matemáticas fundamentais:

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão

A aplicação foi desenvolvida utilizando uma arquitetura modular, dividindo as responsabilidades em componentes independentes, facilitando a manutenção, reutilização e realização de testes.

Além dos testes unitários da calculadora, foram implementados testes de integração para validar a comunicação entre os módulos do sistema.

---

# 🎯 Objetivo

Implementar um sistema de calculadora dividido em módulos independentes e garantir, através de testes automatizados, que a integração entre eles funcione corretamente.

---

# 🏗️ Arquitetura do Sistema

O sistema foi dividido em três módulos principais:

## 1️⃣ EntradaDados

Responsável por:

- Interagir com o usuário.
- Capturar os valores numéricos informados.
- Encaminhar os dados para o módulo de controle.

---

## 2️⃣ GerenciadorOperacao

Responsável por:

- Exibir o menu de operações.
- Receber a opção escolhida pelo usuário.
- Direcionar a execução para o método correto da calculadora.

---

## 3️⃣ Calculadora

Responsável pela lógica de negócio.

Implementa as operações:

- Soma
- Subtração
- Multiplicação
- Divisão

Também realiza a validação para impedir divisão por zero.

---

# 🔄 Fluxo da Aplicação

```text
Usuário
   │
   ▼
EntradaDados
   │
   ▼
GerenciadorOperacao
   │
   ▼
Calculadora
   │
   ▼
Resultado
```

---

# 🛠️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
|------------|------------|
| Java 17 | Linguagem de programação |
| JUnit 5 | Testes unitários e integração |
| Maven | Gerenciamento de dependências |
| IntelliJ IDEA | Ambiente de desenvolvimento |

---

# 📂 Estrutura do Projeto

```text
CalculadoraIntegracao
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── negocio
    │           ├── Calculadora.java
    │           ├── EntradaDados.java
    │           ├── GerenciadorOperacao.java
    │           └── Main.java
    │
    └── test
        └── java
            └── negocio
                ├── CalculadoraTest.java
                └── IntegracaoCalculadoraTest.java
```

---

# ⚙️ Funcionalidades

## Soma

Realiza a soma entre dois números.

Exemplo:

```text
10 + 5 = 15
```

---

## Subtração

Realiza a subtração entre dois números.

Exemplo:

```text
10 - 5 = 5
```

---

## Multiplicação

Realiza a multiplicação entre dois números.

Exemplo:

```text
10 × 5 = 50
```

---

## Divisão

Realiza a divisão entre dois números.

Exemplo:

```text
10 ÷ 5 = 2
```

---

## Tratamento de Exceções

A aplicação impede divisões por zero.

Exemplo:

```text
Não é possível dividir por zero.
```

---

# 🧪 Testes Unitários

Os testes unitários validam individualmente os métodos da classe Calculadora.

Foram implementados testes para:

- ✅ Soma
- ✅ Subtração
- ✅ Multiplicação
- ✅ Divisão
- ✅ Divisão por zero

Objetivo:

Garantir que cada método funcione corretamente de forma isolada.

---

# 🔗 Testes de Integração

Os testes de integração validam a comunicação entre os módulos do sistema.

Fluxo testado:

```text
GerenciadorOperacao
        ↓
Calculadora
        ↓
Resultado
```

Foram criados cenários para verificar:

- ✅ Integração da Soma
- ✅ Integração da Subtração
- ✅ Integração da Multiplicação
- ✅ Integração da Divisão
- ✅ Tratamento de operação inválida

Objetivo:

Garantir que os módulos se comuniquem corretamente e produzam o resultado esperado.

---

# 🚀 Executando o Projeto

## Clonar o Repositório

```bash
git clone https://github.com/SEU-USUARIO/CalculadoraIntegracao.git
```

---

## Entrar na Pasta

```bash
cd CalculadoraIntegracao
```

---

## Executar os Testes

Via Maven:

```bash
mvn test
```

Ou pelo IntelliJ IDEA:

```text
Botão direito em CalculadoraTest
→ Run Tests

Botão direito em IntegracaoCalculadoraTest
→ Run Tests
```

---

# 📊 Resultado Esperado

```text
Tests passed
```

Todos os testes unitários e de integração devem ser executados com sucesso.

---

# 📚 Conceitos Aplicados

Durante o desenvolvimento foram utilizados os seguintes conceitos:

- Programação Orientada a Objetos (POO)
- Separação de Responsabilidades
- Modularização de Sistemas
- Testes Unitários
- Testes de Integração
- Tratamento de Exceções
- Maven
- JUnit 5
- Boas Práticas de Desenvolvimento

---

# 👨‍💻 Autor

**Douglas Magalhães**

Disciplina: Teste e Qualidade de Software

Projeto acadêmico desenvolvido para estudo e aplicação prática de testes unitários e testes de integração utilizando Java.

---

# 📄 Licença

Projeto desenvolvido exclusivamente para fins acadêmicos e educacionais.