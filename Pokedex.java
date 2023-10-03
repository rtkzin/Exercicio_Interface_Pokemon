public class Pokedex extends PokemonAbstract {

    public void pokemonInfo(Pokemon pokemon) {
        System.out.println("Nome: " + pokemon.getNome());
        System.out.println("Tipo: " + pokemon.getTipo());
        System.out.println("Saúde: " + pokemon.getSaude());
    }

    @Override
    public void atacaPokemon(Pokemon alvo) {
        System.out.println("Atacando " + alvo.getNome() + "!");
        alvo.diminuiSaude(10);
        System.out.println(alvo.getNome() + " agora tem " + alvo.getSaude() + " de saúde.");
    }

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        Pokemon charmander = pokedex.criaPokemon("Charmander", "Fogo", 100);

        pokedex.pokemonInfo(charmander);

        Pokemon squirtle = pokedex.criaPokemon("Squirtle", "Água", 100);
        pokedex.atacaPokemon(squirtle);
    }
}