package tehtava_11;

import java.util.Random;

public class Arvuuttaja {
	
	private static Arvuuttaja instance = null;
	Random randomNumber = new Random();
	private int arvattavaNumero;	
		
	public static synchronized Arvuuttaja getInstance() {
        if(instance == null) {
            instance = new Arvuuttaja();
        }
        return instance;
    }
	
	public synchronized Object liityPeliin() {
		this.arvattavaNumero = randomNumber.nextInt(100)+1;
		return new Memento(this.arvattavaNumero);		
	}
	
	public synchronized Boolean vertaaNumeroita(Object object, int arvaus) {
		Memento memento = (Memento) object;
		this.arvattavaNumero = memento.arvattavaNumero;
		return this.arvattavaNumero == arvaus;
	}
	
	private class Memento{
		private int arvattavaNumero;
		
		public Memento(int arvattavaNumero) {
				this.arvattavaNumero = arvattavaNumero;
		}
	}
	
}
