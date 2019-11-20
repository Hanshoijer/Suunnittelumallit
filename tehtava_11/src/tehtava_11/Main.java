package tehtava_11;

public class Main {

	public static void main(String[] args) {
		
		Thread threadMatti = new Thread(new Asiakas("Matti"));
		Thread threadPekka = new Thread(new Asiakas("Pekka"));
		Thread threadSeppo = new Thread(new Asiakas("Seppo"));
		Thread threadKeijo = new Thread(new Asiakas("Keijo"));
		Thread threadMatias = new Thread(new Asiakas("Matias"));
		
		threadMatti.start();
		threadPekka.start();
		threadSeppo.start();
		threadKeijo.start();
		threadMatias.start();

	}

}
