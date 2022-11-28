public class Pokemon extends TiposPokemon{

    private int vida;
    private int ataque;
    private String nome;
   
    public Pokemon(int vida, int ataque, String nome, String tipoDoPokemon) {
        super(tipoDoPokemon);
        this.vida = vida;
        this.ataque = ataque;
        this.nome = nome;
    }
   

    public void atacar(Pokemon atacado){
        System.out.println("POKEMON ATACANDO:" + this.getNome());
        System.out.println("ATAQUE UTILIZADO: " /*+ this.getTipo().getAtaqueDoTipo()*/);
        System.out.println("POKEMON ATACADO: " + atacado.getNome());
        atacado.setVida(atacado.getVida() - this.getAtaque());
        System.out.println("VALOR DE ATAQUE DO " /*+ this.getTipo().getAtaqueDoTipo() + ": " + this.getAtaque()*/);
        System.out.println("VIDA ATUAL DO POKEMON ATACADO: " + atacado.getVida());
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public String getNome() {
        return nome;
    }
}
