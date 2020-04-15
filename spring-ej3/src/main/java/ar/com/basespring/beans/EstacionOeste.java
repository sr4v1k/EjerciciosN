package ar.com.basespring.beans;

public class EstacionOeste implements EstacionMetereologica {

	private Instrumento instrumento;
	
	public void tomarMedicion() {

		instrumento.medir();
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	

}
