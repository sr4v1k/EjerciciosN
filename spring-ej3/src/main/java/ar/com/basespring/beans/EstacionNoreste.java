package ar.com.basespring.beans;

public class EstacionNoreste implements EstacionMetereologica {

	private Instrumento instrumento;

	public  EstacionNoreste(Instrumento instrumento) {
		this.instrumento = instrumento;
	}


	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}


	public void tomarMedicion() {
		instrumento.medir();
	}
}
