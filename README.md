# Siesta

**Siesta (Simple ImperativE SpecificaTion lAnguage)** is a minimalist language designed for expressing behavioral properties.  
It is built on top of **Java**, leveraging the familiarity many developers already have with the language.  
Siesta focuses on including only the essential elements required to express different types of properties, prioritizing simplicity over generality.

---

## Replication Package

The complete results of the article are available in [`results/`](./results), which serves as the **Replication Package**.  
See the summary in [`results/REPLICATION_PACKAGE.md`](./results/REPLICATION_PACKAGE.md).

---

## Repository Structure

- [`property-db-siesta`](./property-db-siesta): dataset of properties from **PropertyDB**, along with the language specification document.  
- [`sample`](./sample): a sample project already configured with the tool, specifying one example property ([`StringBuilder_ThreadSafe`](https://github.com/runtimeverification/property-db/blob/master/annotated-java-api/java/lang/StringBuilder_ThreadSafe.mop)).  
- [`site`](./site): information and overview of the experiments. More details can be found at:  
  👉 [https://specificationeffectiveness.github.io/JSS/site/main.html](https://specificationeffectiveness.github.io/JSS/site/main.html)

---

## Setup Instructions

### Requirements
- Java 1.8
- Apache Commons Lang 3.1

### Running Siesta

Using the [`sample`](./sample) project, given the requirements, you only need to run the following commands:

```bash
ant ajmlc
ant ajmlrac
