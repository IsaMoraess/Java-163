package ATVD_C;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExibirConsoantes {

    public static void main(String[] args) {
        // Caminho do arquivo (substitua pelo seu arquivo)
        String caminhoArquivo = "C:\\Users\\laboratorio\\Desktop"; // Substitua pelo caminho do seu arquivo

        // Chamando o método para ler o arquivo e exibir as consoantes
        exibirConsoantesDoArquivo(caminhoArquivo);
    }

    // Método para ler o arquivo e exibir as consoantes
    public static void exibirConsoantesDoArquivo(String caminhoArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Filtrando e exibindo as consoantes da linha
                for (int i = 0; i < linha.length(); i++) {
                    char caractere = linha.charAt(i);
                    if (ehConsoante(caractere)) {
                        System.out.print(caractere); // Exibe as consoantes sem quebra de linha
                    }
                }
                System.out.println(); // Nova linha após exibir todas as consoantes de uma linha
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    // Método para verificar se o caractere é uma consoante
    public static boolean ehConsoante(char c) {
        // Convertendo para minúsculo e verificando se é uma letra e não é uma vogal
        c = Character.toLowerCase(c);
        return (c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}

