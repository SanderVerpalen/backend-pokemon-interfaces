import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private String type;
    private List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);
    private String name;

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super();

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void flameThrower(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void fireLash(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void pyroBall(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void inferno(Pokemon gymPokemon, Pokemon pokemon) {
    }
}
