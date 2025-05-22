# MSL

MSL stands for Minimalist Specification Language, a concise language designed for expressing properties. It is built on top of Java, the programming language whose API properties we aim to specify, and one that many developers are familiar with. MSL includes only the essential features required to express various types of behavioral properties. Our focus is not on generality.

This repository is organized according to the following structure: 

- the [`property-db-msl`](property-db-msl) folder contains the dataset of properties from PropertyDB, the language specification document;
- the [`results`](results) folder contains the tool prototype for utilizing the language, as well as projects with their respective logs, and additional folders containing the data with the results collected in the experiment. 
- the [`sample`](sample) folder contains a sample project already configured with the tool, specifying a particular property from our sample ([`StringBuilder_ThreadSafe`](https://github.com/runtimeverification/property-db/blob/master/annotated-java-api/java/lang/StringBuilder_ThreadSafe.mop)).
- the [`site`](site) folder contains information about the overview experiments. You can find more details at this link:  https://specificationeffectiveness.github.io/JSS/site/main.html

## Setup Instructions

### Requirements
- Java 1.8
- Apache Commons Lang 3-3.1

### Executing MSL

Considering the [`sample`](sample) project, given the requirements, you only need to execute two commands in the command line: 
```
> ant ajmlc
> ant ajmlrac
```

If you wish to test a different scenario where the property is not violated, you can change the [`main.class`](https://github.com/specificationeffectiveness/JSS/blob/main/sample/StringBuilder%20Single%20Thread/build.xml#L38) property from the [`build.xml`](https://github.com/specificationeffectiveness/JSS/blob/main/sample/StringBuilder%20Single%20Thread/build.xml) file in line 38 to `stringbuilderexample.StringBuilderSingleThreadDemo`.

