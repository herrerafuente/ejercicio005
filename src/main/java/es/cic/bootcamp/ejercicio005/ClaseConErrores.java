package es.cic.bootcamp.ejercicio005;

import java.io.IOException;

import java.io.IOException;

public class ClaseConErrores {
	public void metodo1() {
		throw new UnsupportedOperationException("esto es error");
	}
	
	public int metodo2 (boolean procesa) throws MotorException, IOException {
		if (procesa) {
			throw new MotorException("esto lanza motor error", 5);
		} else {
			throw new IOException("esto lanza error tipo IO");
		}
	}

}
