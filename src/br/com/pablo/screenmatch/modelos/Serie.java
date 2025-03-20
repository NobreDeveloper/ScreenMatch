package br.com.pablo.screenmatch.modelos;

public class Serie extends Titulo{ //Herança
    private int temporadas; //Encapsulamento
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutorsPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutorsPorEpisodio() {
        return minutorsPorEpisodio;
    }

    public void setMinutorsPorEpisodio(int minutorsPorEpisodio) {
        this.minutorsPorEpisodio = minutorsPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return minutorsPorEpisodio * episodiosPorTemporada * temporadas;
    }

    @Override
    public String toString() {
        return "Série: "+ this.getNome() +"(" + this.getAnoDeLancamento() + ")";
    }
}
