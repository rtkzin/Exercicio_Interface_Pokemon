public abstract class PokemonAbstract implements PokemonInterface {

    @Override
    public Pokemon criaPokemon(String nome, String tipo, int saude) {
        return new Pokemon(nome, tipo, saude);
    }

    public abstract void atacaPokemon(Pokemon alvo);
}