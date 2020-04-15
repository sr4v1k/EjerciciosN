package ar.com.basespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.basespring.beans.EstacionMetereologica;
import ar.com.basespring.beans.EstacionNoreste;
import ar.com.basespring.beans.EstacionOeste;


public class App {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EstacionMetereologica norte = context.getBean("estacionMetereologicaNorte",EstacionMetereologica.class);
		norte.tomarMedicion();
		
		EstacionMetereologica sur = context.getBean("estacionMetereologicaSur",EstacionMetereologica.class);
		sur.tomarMedicion();
	   
		sur = context.getBean("estacionMetereologicaSur2",EstacionMetereologica.class);
		sur.tomarMedicion();
		
		
		EstacionMetereologica oeste = context.getBean("estacionOeste", EstacionOeste.class);
		oeste.tomarMedicion();
		
		EstacionMetereologica noreste = context.getBean("estacionNoreste", EstacionNoreste.class);
		noreste.tomarMedicion();
	}
}
