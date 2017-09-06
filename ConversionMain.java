package ConMoneda;

import java.util.Scanner;

public class ConversionMain {
	public static void main(String[] args){
		ConversionMetodo tecnica = new ConversionMetodo();
		
		Scanner entrada = new Scanner(System.in);
		
		double valor1, valor2;
		valor1 = 0.00;
		valor2 = 0.00;
		String moneda1, moneda2;
				
		System.out.print("Entra un valor: ");
		valor1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Pesos, Dolares, Euros: ");
		moneda1 = entrada.next();
				
		System.out.print("Que moneda desea convertirla? Pesos, Dolares, Euros: ");
		moneda2 = entrada.next();
		
		TiposMoneda tipoMoneda1 = TiposMoneda.valueOf(moneda1.toUpperCase());
		TiposMoneda tipoMoneda2 = TiposMoneda.valueOf(moneda2.toUpperCase());
		
		tecnica.conversion.Equivalencia(tipoMoneda1, tipoMoneda2, valor1);
		
	}
}