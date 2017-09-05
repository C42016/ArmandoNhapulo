/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

/**
 *
 * @author Armano
 */
public class Pessoa {
    private String  nome ;
    private int  idade;
    private String Sexo;
    
    public void FazerAniversario(){
    this.idade++;
    }

    public Pessoa(String nome, int idade, String Sexo) {
        this.nome = nome;
        this.idade = idade;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
}
