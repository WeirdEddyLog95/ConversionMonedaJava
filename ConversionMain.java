package ConMoneda;

import java.util.Scanner;

public class ConversionMain {
	public static void main(String[] args){
		//Nota: Valor predeterminado sera el Peso ($)
		//Para pedir el valor de la moneda
		
		ConversionMetodo con = new ConversionMetodo();
		
		Scanner entrada = new Scanner(System.in);
		
		double valor1, valor2;
		valor1 = 0.00;
		valor2 = 0.00;
		
		String moneda1, moneda2;
		
		System.out.print("Entra un valor: ");
		valor1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Pesos, Dolares, Euros: ");
		moneda1 = entrada.nextLine();
				
		System.out.print("Que moneda desea convertirla? Pesos, Dolares, Euros: ");
		moneda2 = entrada.nextLine();
		
		Se aplica unas condiciones adicionales para evitar redundancias, como peso a peso o dolares a dolares
		if(moneda1.equals("Pesos") && moneda2.equals("Dolares")){
			valor2 = con.ConPesosaDolares(valor1);
			System.out.println("La conversion salio de " + "$" + valor1 + " Pesos " + "a " + "$" + valor2 + " Dolares");
		} else if (moneda1.equals("Pesos") && moneda2.equals("Euros")){
			valor2 = con.ConPesosaEuros(valor1);
			System.out.println("La conversion salio de " + "$" + valor1 + " Pesos " + "a " + "$" + valor2 + " Euros");
		} else if (moneda1.equals("Euros") && moneda2.equals("Pesos")){
			valor2 = con.ConEurosaPesos(valor1);
			System.out.println("La conversion salio de " + "$" + valor1 + " Euros " + "a " + "$" + valor2 + " Pesos");
		} else if (moneda1.equals("Euros") && moneda2.equals("Dolares")){
			valor2 = con.ConEurosaDolares(valor1);
			System.out.println("La conversion salio de " + "$" + valor1 + " Euros " + "a " + "$" + valor2 + " Dolares");
		} else if (moneda1.equals("Dolares") && moneda2.equals("Euros")){
			valor2 = con.ConDolaresaEuros(valor1);
			System.out.println("La conversion salio de " + "$" + valor1 + " Dolares " + "a " + "$" + valor2 + " Euros");
		} else if (moneda1.equals("Dolares") && moneda2.equals("Pesos")){
			valor2 = con.ConDolaresaPesos(valor1);
			System.out.println("La conversion salio de " + "$" + valor1 + " Dolares " + "a " + "$" + valor2 + " Pesos");
		} else if(moneda1.equals("Pesos") && moneda2.equals("Pesos")){
			System.out.println("Lo siento, no se puede convertir Pesos a Pesos, favor de poner otro valor de moneda que desea convertir");
		} else if(moneda1.equals("Dolares") && moneda2.equals("Dolares")){
			System.out.println("Lo siento, no se puede convertir Dolares a Dolares, favor de poner otro valor de moneda que desea convertir");
		} else if(moneda1.equals("Euros") && moneda2.equals("Euros")){
			System.out.println("Lo siento, no se puede convertir Euros a Euros, favor de poner otro valor de moneda que desea convertir");
		}

		
	}
}