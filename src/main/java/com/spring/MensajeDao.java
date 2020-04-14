package com.spring;

public class MensajeDao {

	public void insertarMensaje(Mensaje men) {
		System.out.println("Inserta mensaje " + men.getTexto());
	}
}
