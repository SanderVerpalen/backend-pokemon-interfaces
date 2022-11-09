import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner {

    private Pokemon charizard;/*🔥*/
    private Pokemon blastoise;/*🌊*/
    private Pokemon venusaur;/*🌿*/
    private Pokemon ditto;/*🌿*/
    private Pokemon raichu;/*⚡*/
    private Pokemon gyarados;/*🌊*/

    List<Pokemon> pokemons  = Arrays.asList(/*voer de pokemons hier in*/);

    private String name;
    private String town;

    public void setCharizard(Pokemon charizard) {
        this.charizard = charizard;
    }

    public void setBlastoise(Pokemon blastoise) {
        this.blastoise = blastoise;
    }

    public void setVenusaur(Pokemon venusaur) {
        this.venusaur = venusaur;
    }

    public void setDitto(Pokemon ditto) {
        this.ditto = ditto;
    }

    public void setRaichu(Pokemon raichu) {
        this.raichu = raichu;
    }

    public void setGyarados(Pokemon gyarados) {
        this.gyarados = gyarados;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public PokemonGymOwner(String name, String town) {
    }

    public Pokemon getBlastoise() {
        return blastoise;
    }

    public Pokemon getGyarados() {
        return gyarados;
    }

    public Pokemon getCharizard() {
        return charizard;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public Pokemon getRaichu() {
        return raichu;
    }


    public Pokemon getVenusaur() {
        return venusaur;
    }

    public void setPokemons(List<Pokemon> names) {
    }

    public String getTown() {
        return town;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
