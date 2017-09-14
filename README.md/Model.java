package MVP;

public class Model {
	
	private String Moneda;

    public Model() {
    	//Valores de la operacion, establecemos los tipos de moneda que se usaran
        Moneda = "PESOS";
        Moneda = "DOLARES";
        Moneda = "EUROS";
    }

    public void setMoneda(String moneda) {
        Moneda = moneda;
    }

    public String getMoneda() {
    	return Moneda;
    }

}
