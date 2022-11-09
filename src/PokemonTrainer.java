import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private String name;
    private List<Pokemon> pokemons  = Arrays.asList(/*voer de pokemons hier in*/);
    public List<Pokemon> getPokemons() {
        System.out.println("getPokemons() in pokemonTrainer still needs to be implemented.");
        return pokemons;
    }

    public String getName() {
        return name;
    }
}
