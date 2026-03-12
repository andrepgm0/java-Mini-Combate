public class Partida {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();
		Vilao vilao = new Vilao();
		
		heroi.atacar(vilao);
		heroi.atacar(vilao);
		vilao.defender();
		
		System.out.println(heroi.getVida());
		System.out.println(vilao.getVida());
		
		vilao.atacar(heroi);
		heroi.defender();
	}
}
