import java.util.Scanner;

class Main{
  public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

String nombre,apellido,dpi,nit;

System.out.println("Ingrese su nombre");
nombre = teclado.nextLine();

System.out.println("Ingrese su apellido");
apellido = teclado.nextLine();

System.out.println("Ingrese su DPI");
dpi = teclado.nextLine();

System.out.println("Ingrese su Nit");
nit = teclado.nextLine();

System.out.println("Nombres     Apellidos      DPI       Nit");
System.out.println(nombre+ "        "+apellido+"        "+dpi+"      "+nit);
  }
}