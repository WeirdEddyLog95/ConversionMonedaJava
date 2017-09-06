package ConMoneda;

public class ConversionMetodo {
	IConMoneda conversion = new IConMoneda() {
		
		@Override
		public void Equivalencia(TiposMoneda tipoActual, TiposMoneda tipoConvertir, double cantidadActual) {
			switch (tipoActual){
			case PESOS:
				if(tipoConvertir == tipoConvertir.DOLARES){
					double cantidadConvertir = cantidadActual / 17.73; 
					System.out.println("De los " + cantidadActual + " " + TiposMoneda.PESOS + " se convirtio a " + cantidadConvertir + " " + TiposMoneda.DOLARES);
					break;
				} else if (tipoConvertir == tipoConvertir.EUROS){
					double cantidadConvertir = cantidadActual / 20.91; 
					System.out.println("De los " + cantidadActual + " " + TiposMoneda.PESOS + " se convirtio a " + cantidadConvertir + " " + TiposMoneda.EUROS);
				} else {
					System.out.println("Lo siento pero no se puede convertir a la misma cantidad que desea usar");
				}
				break;
			case DOLARES:
				if(tipoConvertir == tipoConvertir.PESOS){
					double cantidadConvertir = cantidadActual / 0.06; 
					System.out.println("De los " + cantidadActual + " " + TiposMoneda.DOLARES + " se convirtio a " + cantidadConvertir + " " + TiposMoneda.PESOS);
					break;
				} else if (tipoConvertir == tipoConvertir.EUROS){
					double cantidadConvertir = cantidadActual / 1.17; 
					System.out.println("De los " + cantidadActual + " " + TiposMoneda.DOLARES + " se convirtio a " + cantidadConvertir + " " + TiposMoneda.EUROS);
				} else {
					System.out.println("Lo siento pero no se puede convertir a la misma cantidad que desea usar");
				}
				break;
			case EUROS:
				if(tipoConvertir == tipoConvertir.DOLARES){
					double cantidadConvertir = cantidadActual / 0.85; 
					System.out.println("De los " + cantidadActual + " " + TiposMoneda.EUROS + " se convirtio a " + cantidadConvertir + " " + TiposMoneda.DOLARES);
					break;
				} else if (tipoConvertir == tipoConvertir.PESOS){
					double cantidadConvertir = cantidadActual / 0.05; 
					System.out.println("De los " + cantidadActual + " " + TiposMoneda.EUROS + " se convirtio a " + cantidadConvertir + " " + TiposMoneda.PESOS);
				} else {
					System.out.println("Lo siento pero no se puede convertir a la misma cantidad que desea usar");
				}
				break;
			}
			
		}

	};
	
}
