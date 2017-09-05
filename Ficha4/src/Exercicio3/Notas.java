/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author Armano
 */
public class Notas {
    
    private String Turma;
    private String Nome;
    private int notas ;

    public Notas() {
    }

    public Notas(String Turma, String Nome, int notas) {
        this.Turma = Turma;
        this.Nome = Nome;
        this.notas = notas;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }
    public void Media(){}
    public void MelhorMedia (){}
}
