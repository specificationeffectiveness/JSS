# Siesta (Simple ImperativE SpecificaTion lAnguage)

**Siesta** is a minimalist specification language designed to express behavioral properties of programs.

It is built on top of **Java**, leveraging the familiarity that many developers already have with the language and its ecosystem.

Siesta focuses on **simplicity**:
- Includes only the minimal set of features required to express different kinds of behavioral properties.  
- Does not aim for generality, but instead prioritizes clarity and essential expressiveness.  
- Maintains close alignment with Java syntax, making it easy for developers to adopt.  

The goal of Siesta is to provide a straightforward and efficient approach to runtime verification, reducing complexity while preserving the expressive power necessary to specify meaningful properties.


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
