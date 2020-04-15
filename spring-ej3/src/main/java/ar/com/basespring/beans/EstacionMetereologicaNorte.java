package ar.com.basespring.beans;

public class EstacionMetereologicaNorte implements EstacionMetereologica{

	private Instrumento instrumento;

	public EstacionMetereologicaNorte(Instrumento instrumento) {
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
