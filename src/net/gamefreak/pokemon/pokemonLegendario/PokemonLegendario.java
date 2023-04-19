package net.gamefreak.pokemon.pokemonLegendario;

import net.gamefreak.pokemon.Pokemon;


public class PokemonLegendario extends Pokemon {
    protected String localizacion;


    public PokemonLegendario(String nombre, String tipo, float altura, float peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }
    

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        String msg = (this.nombre.toUpperCase() + "\n");
        msg += (this.tipo.toUpperCase() + "\n");
        msg += ("HT ");
        if (altura > 0) {
            msg += (altura + "\n");
        } else msg += ("???" + "\n");
        msg += ("WT ");
        if (peso > 0) {
            msg += (peso + " lb" + "\n");
        } else msg += ("???" + "\n");
        msg += ("-#-#-#--------#-#-#" + "\n");
        msg += "DESCRIPTION ";
        if (descripcion != null) {
            msg += (descripcion + "\n");
        } else msg += ("???") + "\n";
        msg += "LOCATION " + localizacion;
        return msg;
    }
}
