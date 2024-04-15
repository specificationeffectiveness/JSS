package mop;

import java.io.*;

public class Reader_UnmarkedReset_1 {
    public static void main(String[] args) throws IOException {
        // Criando um BufferedReader com um StringReader como argumento
        BufferedReader reader = new BufferedReader(new StringReader("Hello World"));

        // Lendo os primeiros 5 caracteres
        reader.read(new char[5]);
      
        
        // Tentando redefinir o estado do leitor sem chamar mark() primeiro
      reader.reset(); // Esta chamada aciona o erro
      reader.mark(5);
    }
}

