package ar.com.basespring.beans;

public class EstacionMetereologicaSur implements EstacionMetereologica{
	
	private Instrumento instrumento;
	private Instrumento instrumento2;
	
	public EstacionMetereologicaSur() {

	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	public void tomarMedicion() {
		instrumento.medir();
		instrumento2.medir();
	}

	public Instrumento getInstrumento2() {
		return instrumento2;
	}

	public void setInstrumento2(Instrumento instrumento2) {
		this.instrumento2 = instrumento2;
	}
	
	

}
