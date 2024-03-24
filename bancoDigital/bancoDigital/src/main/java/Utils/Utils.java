package Utils;

import Exceptions.ExecoesBooleanas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    // Validar CPF
    public static boolean validarCPF(String cpf) throws ExecoesBooleanas {
        if (isNullOrEmpty(cpf))
            throw new ExecoesBooleanas("CPF inválido: CPF vazio ou nulo.");

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11)
            throw new ExecoesBooleanas("CPF inválido: Tamanho do CPF diferente de 11.");

        if (cpf.matches("(\\d)\\1{10}"))
            throw new ExecoesBooleanas("CPF inválido: Dígitos repetidos.");

        int digito1 = calcularDigito(cpf.substring(0, 9), 10);
        int digito2 = calcularDigito(cpf.substring(0, 9) + digito1, 11);
        
        if (!cpf.equals(cpf.substring(0, 9) + digito1 + digito2))
            throw new ExecoesBooleanas("CPF inválido: Dígitos verificadores incorretos.");

        return true;
    }

    // Validar nome
    public static boolean validarNome(String nome) throws ExecoesBooleanas {
        if (isNullOrEmpty(nome))
            throw new ExecoesBooleanas("Nome inválido: Nome vazio ou nulo.");

        if (!nome.matches("[a-zA-ZÀ-ú]+(\\s[a-zA-ZÀ-ú]+)*"))
            throw new ExecoesBooleanas("Nome inválido: Nome contém caracteres inválidos.");

        return true;
    }

    // Validar transação
    public static boolean validarTransacao(double valor) throws ExecoesBooleanas {
        if (valor <= 0)
            throw new ExecoesBooleanas("Valor da transação inválido: Deve ser maior que zero.");

        return true;
    }

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private static int calcularDigito(String cpf, int peso) {
        int soma = 0;
        for (int i = 0; i < cpf.length(); i++)
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (peso - i);
        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }
}
        

