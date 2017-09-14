package MVP;

public class Presenter {
	
	private View view;
	 private Model model;

	  public Presenter(View view, Model model) {
	      this.view = view;
	      this.model = model;
	 }
	  
	  //Para escribir las operaciones	  
	  public void Operaciones(double acMon, String moneda1, String moneda2) {
			 
			 String mon1 = moneda1;
			 
			 String mon2 = moneda2;
			 
			 double cantidadConvertir = 0.0;
			 
			 String result = null;
			 switch(mon1){
			 case "PESOS":
					if(mon2 == "DOLARES"){
						cantidadConvertir = acMon / 17.73;
						result = "La conversion de " + acMon + " " + moneda1 + " a " + cantidadConvertir + " " + moneda2;
						break;
					} else if (mon2 == "EUROS"){
						cantidadConvertir = acMon / 20.91;
						result = "La conversion de " + acMon + " " + moneda1 + " a " + cantidadConvertir + " " + moneda2;
					} else {
						result = "No se puede realizar esta operacion";
					}
					break;
				case "DOLARES":
					if(mon2 == "PESOS"){
						cantidadConvertir = acMon / 0.06; 
						result = "La conversion de " + acMon + " " + moneda1 + " a " + cantidadConvertir + " " + moneda2;
						break;
					} else if (mon2 == "EUROS"){
						cantidadConvertir = acMon / 1.17; 
						result = "La conversion de " + acMon + " " + moneda1 + " a " + cantidadConvertir + " " + moneda2;
					} else {
						result = "No se puede realizar esta operacion";
					}
					break;
				case "EUROS":
					if(mon2 == "DOLARES"){
						cantidadConvertir = acMon / 0.85; 
						result = "La conversion de " + acMon + " " + moneda1 + " a " + cantidadConvertir + " " + moneda2;
						break;
					} else if (mon2 == "PESOS"){
						cantidadConvertir = acMon / 0.05; 
						result = "La conversion de " + acMon + " " + moneda1 + " a " + cantidadConvertir + " " + moneda2;
					} else {
						result = "No se puede realizar esta operacion";
					}
					break;
			 }
			 
			 view.updateStatusLabel(result, cantidadConvertir);
	}

}
