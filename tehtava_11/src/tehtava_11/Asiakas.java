package tehtava_11;

import java.util.Random;

public class Asiakas implements Runnable{
	
	private Arvuuttaja arvuuttaja;
	private Object objekti;
	private int arvaus;
	private String nimi;
	private Random randomNumber;
	private int arvausNumero = 0;
	
	public Asiakas(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public void run() {
		this.arvuuttaja = Arvuuttaja.getInstance();
		objekti = arvuuttaja.liityPeliin();
		randomNumber = new Random();
		
		while(!arvuuttaja.vertaaNumeroita(objekti, arvaus)) {
			arvaus = randomNumber.nextInt(100)+1;
			arvausNumero++;
			System.out.println("" + nimi + " arvasi väärin: " + arvaus + " arvauksia: " + arvausNumero);
			
		}
		System.out.println("" + nimi + " arvasi oikein: " + arvaus + " arvauksella: " + arvausNumero);
		
	}
}
