public class Jogador {

	private int vida = 100;
	
	private int ataque = 15;
	
	private int defesa;
	
	public Jogador(int vida, int ataque, int defesa) {
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
	}
	public boolean atacar(Jogador oponente) {
		int dano = ataque - oponente.defesa;
		if(dano < 0) {
			dano = 0;
		}
		oponente.defender(dano);
			return true;
	}
	public void defender(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
  }
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
  }

}
