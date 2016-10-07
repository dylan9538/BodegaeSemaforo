package mundo;

import java.util.concurrent.Semaphore;

public class Bodega {
	private int tipoUno, tipoDos, capacidad;
	private Semaphore cantidadArticulosTipo1;
	private Semaphore cantidadArticulosTipo2;
	private Semaphore espacioBodega;
	private Semaphore mutex;
	
	public Bodega() {
		tipoUno = 0;
		tipoDos = 0;
		capacidad = 200;
		cantidadArticulosTipo1 = new Semaphore(0);
		cantidadArticulosTipo2 = new Semaphore(0);
		espacioBodega = new Semaphore(200);
		mutex = new Semaphore(1);
		System.out.println("La bodega se inició correctamente");
		System.out.println("-------------------------------------");
	}

	// tipo uno --> true
	// tipo dos --> false
	public void descargarPaquete(boolean tipo) throws InterruptedException {

		if (tipo) {
			
			espacioBodega.acquire(10);
			mutex.acquire();
			capacidad = capacidad - 10;
			tipoUno++;
			printInfo("uno");
			mutex.release();
			cantidadArticulosTipo1.release(1);
		} else {
			
			espacioBodega.acquire(15);
			mutex.acquire();
			capacidad = capacidad - 15;
			tipoDos++;
			printInfo("dos");
			mutex.release();
			cantidadArticulosTipo2.release(1);
		}
	}

	public void crearPaquete() throws InterruptedException {
		cantidadArticulosTipo1.acquire(3);
		cantidadArticulosTipo2.acquire(4);
		espacioBodega.release(90);
		tipoUno -= 3;
		tipoDos -= 4;
		capacidad += 90;
		printInfo(null);
		
		
		
	}

	private void printInfo(String tipo) {
		if (tipo != null)
			System.out.println("Se descargó un paquete tipo " + tipo);
		else
			System.out.println("Se creó el paquete correctamente");

		System.out.println("-------------------------------------");
		System.out.println("Capacidad: " + capacidad);
		System.out.println("Tipo Uno: " + tipoUno);
		System.out.println("Tipo Dos: " + tipoDos);
		System.out.println("-------------------------------------");

	}
}
