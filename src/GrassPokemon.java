import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private String type;
    private List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);
    private String name;

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
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

    public void leaveBlade(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void leechSeed(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void solarBeam(Pokemon gymPokemon, Pokemon pokemon) {
    }

    public void leafStorm(Pokemon gymPokemon, Pokemon pokemon) {
    }
}
