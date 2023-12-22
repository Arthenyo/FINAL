package org.example.QUESTAO1;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
                "O que é programação estruturada?",
                "Quais as características da programação estruturada?",
                "O que é programação orientada a objetos (POO)?",
                "O que é Herança?",
                "O que é Interfaces?",
                "O que é Polimorfismo?"
        };

        String[][] alternativas = {
                {"A) Uso de classes e objetos", "B) Uso de funções e procedimentos", "C) Programação com interfaces"},
                {"A) Programação baseada em funções", "B) Uso de herança e polimorfismo", "C) Programação com eventos"},
                {"A) Programação baseada em funções", "B) Uso de classes e objetos", "C) Foco em procedimentos e rotinas"},
                {"A) Repetição de código em diferentes classes", "B) Compartilhamento de atributos e métodos entre classes", "C) Isolamento de classes sem relação"},
                {"A) Um tipo de classe abstrata com todos os métodos abstratos", "B) Um contrato para implementação de métodos específicos", "C) Uma ferramenta para criar interfaces gráficas"},
                {"A) Múltiplos métodos com o mesmo nome", "B) Um objeto que pode assumir várias formas", "C) A habilidade de processar objetos diferentemente com base em sua classe"}
        };


        char[] respostas = {'B','B','B','B','B','B'};
        int pontos = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);

            for (int j = 0; j < alternativas[i].length; j++) {
                System.out.println(alternativas[i][j]);
            }

            System.out.print("Sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (resposta == respostas[i]) {
                pontos += 5;
            } else {
                pontos -= 1;
            }
        }

        System.out.println("\nRespostas corretas:");
        for (int i = 0; i < respostas.length; i++) {
            System.out.println((i + 1) + ") " + respostas[i]);
        }

        System.out.println("\nSua pontuação: " + pontos);
        scanner.close();
    }
}
