public class TiposPokemon {

    private String nomeDoTipo;
    private String ataqueDoTipo;

    public TiposPokemon(String nomeDoTipo) {
        this.nomeDoTipo = nomeDoTipo;
    }
    public String getNomeDoTipo() {
        return nomeDoTipo;
    }
    public String retornaAtaqueDoTipo() {
        if(nomeDoTipo == "Fogo"){
            return "Flamethrower";
        }
        if(nomeDoTipo == "Agua"){
            return "Hydro Pump";
        }
        if(nomeDoTipo == "Planta"){
            return "Solar Beam";
        }else {
            return "Quick attack";
        }
    }
}
