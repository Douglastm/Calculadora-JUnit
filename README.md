# 🧮 Calculadora com Testes Unitários em Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange)
![JUnit](https://img.shields.io/badge/JUnit-5.10-green)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![Status](https://img.shields.io/badge/Status-Concluído-success)

Projeto desenvolvido para a disciplina de **Teste e Qualidade de Software**, com o objetivo de implementar uma calculadora contendo as quatro operações matemáticas fundamentais e seus respectivos testes unitários utilizando **JUnit 5**.

</div>

---

# 📋 Sobre o Projeto

Este projeto consiste na implementação de uma calculadora simples desenvolvida em **Java**, contendo as quatro operações matemáticas fundamentais:

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão

Além da implementação das operações, foram desenvolvidos testes unitários utilizando o framework **JUnit 5**, garantindo a validação dos resultados esperados e contribuindo para a qualidade do software.

---

# 🎯 Objetivos

- Implementar as operações fundamentais da matemática.
- Aplicar conceitos de testes unitários.
- Utilizar o framework JUnit 5.
- Praticar a automação de testes.
- Garantir a confiabilidade dos métodos desenvolvidos.

---

# 🛠️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
|------------|------------|
| Java 17 | Linguagem de programação |
| JUnit 5 | Framework de testes unitários |
| Maven | Gerenciamento de dependências |
| IntelliJ IDEA | Ambiente de desenvolvimento |

---

# 📂 Estrutura do Projeto

```text
CalculadoraJUnit
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── negocio
    │           └── Calculadora.java
    │
    └── test
        └── java
            └── negocio
                └── CalculadoraTest.java
```

---

# ⚙️ Funcionalidades

## Soma

Realiza a soma entre dois números.

**Exemplo:**

```text
10 + 5 = 15
```

---

## Subtração

Realiza a subtração entre dois números.

**Exemplo:**

```text
10 - 5 = 5
```

---

## Multiplicação

Realiza a multiplicação entre dois números.

**Exemplo:**

```text
10 * 5 = 50
```

---

## Divisão

Realiza a divisão entre dois números.

**Exemplo:**

```text
10 / 5 = 2
```

### Tratamento de Erro

Caso seja realizada uma tentativa de divisão por zero, o sistema lança uma exceção:

```text
Não é possível dividir por zero.
```

---

# 🧪 Testes Unitários

Foram implementados testes para validar:

- ✅ Soma
- ✅ Subtração
- ✅ Multiplicação
- ✅ Divisão
- ✅ Tratamento de divisão por zero

Cada teste executa cenários diferentes e compara os resultados obtidos com os resultados esperados.

---

# 🚀 Executando o Projeto

## Clonar o Repositório

```bash
git clone https://github.com/SEU-USUARIO/CalculadoraJUnit.git
```

---

## Acessar a Pasta

```bash
cd CalculadoraJUnit
```

---

## Executar os Testes

Via Maven:

```bash
mvn test
```

Ou diretamente pelo IntelliJ IDEA:

```text
Botão direito em CalculadoraTest
→ Run 'CalculadoraTest'
```

---

# 📊 Resultado Esperado

```text
5 tests passed
5 tests total
```

Todos os testes devem ser executados com sucesso.

---

# 🔍 Exemplo de Saída dos Testes

```text
==================================
Iniciando execução do teste...
Testando operação de Soma
Teste executado com sucesso!
==================================

==================================
Iniciando execução do teste...
Testando operação de Subtração
Teste executado com sucesso!
==================================
```

---

# 📚 Conceitos Aplicados

Durante o desenvolvimento foram aplicados os seguintes conceitos:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Testes Unitários
- Tratamento de Exceções
- Automação de Testes
- Maven
- JUnit 5

---

# 👨‍💻 Autor

**Douglas Magalhães**

Disciplina: **Teste e Qualidade de Software**

Universidade: **UNIVEL**

---

# 📄 Licença

Este projeto foi desenvolvido exclusivamente para fins acadêmicos.