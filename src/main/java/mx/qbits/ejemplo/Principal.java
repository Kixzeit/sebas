package mx.qbits.ejemplo;

public class Principal {

  public static void main(String... argv) {
    // abuelo a = new abuelo();
        papa2 p = new papa2();
    System.out.println(p.nombre);
	    Calculadora c = new Calculadora();
        System.out.println("Resultado: " + c.pow(2, 7));
      System.out.println(c.toString());
	  }

}
