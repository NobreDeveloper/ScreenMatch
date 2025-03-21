package br.com.pablo.screenmatch.modelos;

import br.com.pablo.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { //Herança
    private String diretor;

    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoDeLancamento() +")";
    }
}
