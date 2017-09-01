package ConMoneda;

public class ConversionMetodo {
	
	//Para los pesos
	public double ConPesosaDolares (double moneda){
		//Se requiere la cantidad en pesos
		double MonedaActual = moneda;
		//Se requiere el tipo de conversion que desea
		//En dolares
		double monedaD = 1.00;
		//Para comprar 1 dolar en Pesos
		double monedaPValor = 17.73;
		//Proceso para la conversion
		double Proceso = ((monedaD*MonedaActual)/monedaPValor);
		return Proceso;
	}
	
	public double ConPesosaEuros (double moneda){
		//Se requiere la cantidad en pesos
		double MonedaActual = moneda;
		//Se requiere el tipo de conversion que desea
		//En Euros
		double monedaE = 1.00;
		//Para comprar 1 euro en Pesos
		double monedaPValor = 20.91;
		//Proceso para la conversion
		double Proceso = ((monedaE*MonedaActual)/monedaPValor);
		return Proceso;
	}
	
	//Para los euros
	public double ConEurosaPesos (double moneda){
		//Se requiere la cantidad en pesos
		double MonedaActual = moneda;
		//Se requiere el tipo de conversion que desea
		//En Pesos
		double monedaP = 1.00;
		//Para comprar 1 peso en Euros
		double monedaEValor = 0.05;
		//Proceso para la conversion
		double Proceso = ((monedaP*MonedaActual)/monedaEValor);
		return Proceso;
	}
	
	public double ConEurosaDolares (double moneda){
		//Se requiere la cantidad en pesos
		double MonedaActual = moneda;
		//Se requiere el tipo de conversion que desea
		//En Dolares
		double monedaD = 1.00;
		//Para comprar 1 dolar en Euros
		double monedaEValor = 0.85;
		//Proceso para la conversion
		double Proceso = ((monedaD*MonedaActual)/monedaEValor);
		return Proceso;
	}
	
	//Para los Dolares
	public double ConDolaresaEuros (double moneda){
		//Se requiere la cantidad en pesos
		double MonedaActual = moneda;
		//Se requiere el tipo de conversion que desea
		//En Euros
		double monedaE = 1.00;
		//Para comprar 1 Euro en dolares
		double monedaDValor = 1.17;
		//Proceso para la conversion
		double Proceso = ((monedaE*MonedaActual)/monedaDValor);
		return Proceso;
	}
	
	public double ConDolaresaPesos (double moneda){
		//Se requiere la cantidad en pesos
		double MonedaActual = moneda;
		//Se requiere el tipo de conversion que desea
		//En Pesos
		double monedaP = 1.00;
		//Para comprar 1 peso en dolares
		double monedaDValor = 0.06;
		//Proceso para la conversion
		double Proceso = ((monedaP*MonedaActual)/monedaDValor);
		return Proceso;
	}
}
