import java.util.Scanner;

public class Main {

    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. Uma senha deve ter pelo menos oito caracteres.\n" +
                        "2. Uma senha consiste apenas de letras e dígitos.\n" +
                        "3. Uma senha deve conter pelo menos dois dígitos. \n" +
                        "Digite uma senha: ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Senha valida: " + s);
        } else {
            System.out.println("Senha invalida: " + s);
        }

    }

    public static boolean is_Valid_Password(String senha) {

        if (senha.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < senha.length(); i++) {

            char ch = senha.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}