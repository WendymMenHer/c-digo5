import java.util.Scanner; // No se había importado

public class Codigo5 {
    public static void main(String[] args) { // no tenía main
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");//cambie de comilla simple a doble comilla
        int c = Integer.parseInt(s.nextLine()); // Convertí la entrada a un número entero
        int ni = c;
        
        int afo = 0;
        int noAfo = 0;

        while (c > 0) {  // Tenía a ni
            int digito = c % 10; //cambiar ni por c en todo el código

            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }

            c /= 10;  //Seguía teniendo a ni
        }

        if (afo > noAfo) {
            System.out.println("El " + ni + " es un número afortunado.");
        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
        }

        s.close(); // Para cerrar el Scanner
    }
}