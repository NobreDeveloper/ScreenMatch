package br.com.pablo.screenmatch.principal;

import br.com.pablo.screenmatch.modelos.Filme;
import br.com.pablo.screenmatch.modelos.Serie;
import br.com.pablo.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chegão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPablo = new Filme("Vingadores", 2012);
        filmeDoPablo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmeDoPablo);
        lista.add(outroFilme);
        lista.add(lost);


        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao()>2){
                /*
                * (item isntanceof Filme filme)
                * -- é semelhante a inicialização da variável
                * -- Filme filme = (Filme) item;
                * */
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Christopher Nolan");
        buscaPorArtista.add("Zack Snyder");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista); // SOMENTE PORQUE A CLASSE TITULO IMPLEMENTA UM METODO DA INTERFACE COMPARABLE, O compareTo;
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

    }
}
