# Siesta

**Siesta (Specification Implementation for Expressing Software Temporal Assertions)** é uma linguagem minimalista projetada para expressar propriedades de comportamento.  
Ela é construída sobre **Java**, aproveitando a familiaridade que muitos desenvolvedores já têm.  
O foco do Siesta é incluir apenas os elementos essenciais para expressar diferentes tipos de propriedades, priorizando a simplicidade em vez da generalidade.

---

## Replication Package

Os resultados completos do artigo estão em [`results/`](./results), que serve como **Replication Package**.  
Veja o sumário em [`results/REPLICATION_PACKAGE.md`](./results/REPLICATION_PACKAGE.md).

---

## Estrutura do Repositório

- [`property-db-msl`](./property-db-msl): dataset de propriedades do **PropertyDB**, além do documento de especificação da linguagem.  
- [`results`](./results): protótipo da ferramenta, projetos com seus respectivos logs e dados/resultados coletados no experimento.  
- [`sample`](./sample): projeto de exemplo já configurado com a ferramenta, especificando uma propriedade de amostra ([`StringBuilder_ThreadSafe`](https://github.com/runtimeverification/property-db/blob/master/annotated-java-api/java/lang/StringBuilder_ThreadSafe.mop)).  
- [`site`](./site): informações sobre os experimentos e visão geral. Detalhes disponíveis em:  
  👉 [https://specificationeffectiveness.github.io/JSS/site/main.html](https://specificationeffectiveness.github.io/JSS/site/main.html)

---

## Setup Instructions

### Requirements
- Java 1.8
- Apache Commons Lang 3.1

### Executando Siesta

Usando o projeto [`sample`](./sample), com os requisitos instalados, basta executar:

```bash
ant ajmlc
ant ajmlrac
