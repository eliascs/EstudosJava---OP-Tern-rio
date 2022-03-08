package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String saidaResultado;



        String media = JOptionPane.showInputDialog("Qual o Valor da Media?");
        double mediaFinal = Double.parseDouble(media);

        saidaResultado = mediaFinal >= 7 ? "Aluno Aprovado" : (mediaFinal >= 4  && mediaFinal <=6) ? "Aluno de Recuperação" : "Aluno Reprovado;";
        System.out.println(saidaResultado);
    }
}

