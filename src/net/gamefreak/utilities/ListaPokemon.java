package net.gamefreak.utilities;

import net.gamefreak.pokemon.Pokemon;

public class ListaPokemon {
   
    private Pokemon[] listaPokemon;
    private int totalPokemon = 0;

    public ListaPokemon() {
        this.listaPokemon = new Pokemon[1];
    }

    public void anyadirPoke(Pokemon poke) {
        Pokemon[] nuevaListaPokemon = new Pokemon[this.totalPokemon + 1];

        for (int i = 0; i < this.listaPokemon.length; i++) {
            nuevaListaPokemon[i] = this.listaPokemon[i];
        }

        nuevaListaPokemon[this.totalPokemon] = poke;
        this.listaPokemon = nuevaListaPokemon;
        this.totalPokemon++;
    }

    public void eliminarPoke(String nombre) {
        int elementoTotales = 0;
        for (int i = 0; i < listaPokemon.length; i++) {
            if (nombre.equals(listaPokemon[i].getNombre())) {
                listaPokemon[i] = null;
                System.out.println("Eliminado pokemon de la lista de avistados");
            } else {
                elementoTotales++;
                System.out.println("No se ha podido encontrar el pokemon");
            }
        }

        Pokemon[] nuevaListaPokemon = new Pokemon[elementoTotales];
        int nuevoIndice = 0;

        for (int i = 0; i < this.listaPokemon.length ; i++) {
            if (this.listaPokemon[i] != null) {
                nuevaListaPokemon[nuevoIndice] = this.listaPokemon[i];
                nuevoIndice++;
            }
        }

        this.listaPokemon = nuevaListaPokemon;
        this.totalPokemon = elementoTotales;
    }

    public void desplegar() {
        int contador = 1;
        for (Pokemon pokemon : this.listaPokemon) {
            System.out.println(contador + " " + pokemon);
            contador++;
        }
    }

    public Pokemon retornar(int posicionPokemon){
        if (listaPokemon[posicionPokemon - 1] == null) {
            return null;
        }
        return listaPokemon[posicionPokemon -1];
    }
}
