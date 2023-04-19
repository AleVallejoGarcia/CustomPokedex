package net.gamefreak.pokemon;

public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected float altura;
    protected float peso;
    protected String descripcion;

    public Pokemon(String nombre, String tipo, float altura, float peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura; 
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return this.nombre; }
    public String getTipo() { return this.tipo; }
    public float getAltura() { return this.altura; }
    public float getPeso() { return this.peso; }
    public String getDescripcion() { return this.descripcion; }

    public void setAltura(float altura) { this.altura = altura; }
    public void setPeso(float peso) { this.peso = peso; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

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
            msg += (descripcion);
        } else msg += ("???");

        return msg;
    }

}