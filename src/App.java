import net.gamefreak.pokemon.Pokemon;
import net.gamefreak.pokemon.pokemonLegendario.PokemonLegendario;
import net.gamefreak.utilities.ListaPokemon;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre;
        String tipo;
        String localizacion;
        float altura;
        float peso;
        String descripcion;

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        ListaPokemon listaPokemonAvistados = new ListaPokemon();
        ListaPokemon listaPokemonCapturados = new ListaPokemon();

        while (salir != true) {
            System.out.println("Muy buenas futuro maestro pokémon, ¿Que deseas hacer?");
            System.out.println("a. Añadir un pokemon avistado");
            System.out.println("b. Añadir un avistamiento legendario");
            System.out.println("c. Pasar a capturados");
            System.out.println("d. Mostrar lista de avistados");
            System.out.println("e. Mostrar lista de capturados");
            System.out.println("f. Cerrar la pokedex");

            String opcion = teclado.nextLine();
            switch (opcion) {
                case "a":
                    System.out.println("Introduca el nombre del pokemon");
                    nombre = teclado.nextLine();
                    System.out.println("Introduzca el tipo del pokemon");
                    tipo = teclado.nextLine();
                    Pokemon pokemonAvistado  = new Pokemon(nombre, tipo);

                    listaPokemonAvistados.anyadirPoke(pokemonAvistado);
                    break;
                case "b":
                    System.out.println("Introduzca el nombre del pokemon");
                    nombre = teclado.nextLine();
                    System.out.println("Introduzca el tipo del pokemon");
                    tipo = teclado.nextLine();
                    System.out.println("Introduzca la localización donde avisto el pokemon");
                    localizacion = teclado.nextLine();
                    PokemonLegendario pokemonLegendarioAvistado  = new PokemonLegendario(nombre, tipo, localizacion);

                    listaPokemonAvistados.anyadirPoke(pokemonLegendarioAvistado);
                    break;
                case "c":
                    int numeroPokedex;
                    listaPokemonAvistados.desplegar();
                    System.out.println("Introduzca el número del pokemon que ha capturado");
                    numeroPokedex = teclado.nextInt();
                    Pokemon pokemonCapturado = listaPokemonAvistados.retornar(numeroPokedex);
                    System.out.println("Introduzca la altura del pokemon en metros");
                    altura = teclado.nextFloat();
                    pokemonCapturado.setAltura(altura);
                    System.out.println("Introduzca el peso del pokemon en lb");
                    peso = teclado.nextFloat();
                    pokemonCapturado.setPeso(peso);
                    teclado.nextLine();
                    System.out.println("Introduzca la descripcion del pokemon");
                    descripcion = teclado.nextLine();
                    pokemonCapturado.setDescripcion(descripcion);
                    listaPokemonCapturados.anyadirPoke(pokemonCapturado);
                    listaPokemonAvistados.eliminarPoke(pokemonCapturado.getNombre());
                    break;
                case "d":
                    listaPokemonAvistados.desplegar();
                    break;
                case "e":
                    listaPokemonCapturados.desplegar();
                    break;
                case "f":
                    salir = true;
                    break;
            

            }
        }
    }
}
