package br.com.pablo.screenmatch.calculos;

import br.com.pablo.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){ //Polimorfismo
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
