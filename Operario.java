package mundo;

import java.util.Random;

public class Operario extends Thread {

	private Bodega bodega;

	public Operario(Bodega bodega) {
		this.bodega = bodega;
	}

	@Override
	public void run() {
		boolean tipo;
		while (true) {
			tipo = new Random().nextBoolean();
			try {
				bodega.descargarPaquete(tipo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
