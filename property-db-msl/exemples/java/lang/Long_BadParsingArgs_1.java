package mop;

import java.lang.Long;

public class Long_BadParsingArgs_1 {
    public static void main(String[] args) {

        long numeroLong = Long.parseLong("22");

        //Teste 0: vazio
       // testeLongParseInvalido(" "); // Isso deve acionar o aspecto

        // Teste 1: Chamada válida para Long.parseLong
       // testeLongParse("123456");

        // Teste 2: Chamada inválida (violando o aspecto) para Long.parseLong
       testeLongParseInvalido("abc"); // Isso deve acionar o aspecto

        testLongParseRadix("12345", 16);
//        testLongParseRadix("12345", 2);
    }

    public static void testeLongParse(String numeroString) {
        try {
            long numeroLong = Long.parseLong(numeroString);
            System.out.println("Número convertido: " + numeroLong);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para long: " + e.getMessage());
        }
    }

    public static void testeLongParseInvalido(String numeroString) {
        try {
            long numeroLong = Long.parseLong(numeroString);
            System.out.println("Número convertido: " + numeroLong);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para long: " + e.getMessage());
        }
    }

    // radix
    public static void testLongParseRadix(String str, int number) {
        long numeroLong = Long.parseLong(str, number);
        System.out.println("Número convertido: " + numeroLong);
    }
}
