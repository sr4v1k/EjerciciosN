package com.spring;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBaseSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Mensaje mensaje = context.getBean("mensajeComun", Mensaje.class);
		// verificar si es el cumplea�os, Navidad u otro dia y mostrar mensaje
		Date hoy = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		if (sdf.format(hoy).equals("12-25")) {
			mensaje = context.getBean("mensajeNavidad", Mensaje.class);
		}
		else if (sdf.format(hoy).equals("10-30")) {
			mensaje = context.getBean("mensajeCumple", Mensaje.class);
		}
		else if (sdf.format(hoy).equals("04-12")) {
			mensaje = context.getBean("mensajePascua", Mensaje.class);
		}
		System.out.println(mensaje.getTexto());

		MensajeService ms = context.getBean("mensajeService", MensajeService.class);
		ms.insertarMensaje(mensaje);
	}

}
