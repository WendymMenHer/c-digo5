import java.util.Scanner;// No se había importado el scanner

public class Codigo5 {
	public static void main(String[] args) { // Le faltaba el main
		
	
	    Scanner s = new Scanner(System.in);// le faltaba el system.in
	    System.out.print("Introduzca un número: ");// Estaba cerrando con una comilla simple en lugar de doble
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); // el valor de un int no puede ser un String como ni
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {//se tiene que hacer referencia a la variable no al valor de la variable
		  int digito = (int)(c % 10);// ni es un string no se puede hacer operaciones con él.
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  c /= 10; // de nuevo ni
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");//le faltaba la t en print
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	}
	}