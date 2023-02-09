package mx.qbits.ejemplo;

import mx.qbits.bisAbuelo;

public class abuelo extends bisAbuelo {
  public int suma(int a, int b) {
    return a + b;
  }
  // ________________________Tarea _______________________
  
  public int sumaRecursiva(int n) {
    if (n == 0)
      return 0;
    else
      return n + sumaRecursiva(n - 1);
  }
  
  // ________________________Tarea _______________________

  public int resta(int a, int b) {
    
    return a - b;
  }

  public int multiplicacion(int a, int b) {
    return a * b;
  }

  public int division(int a, int b) {
    return a / b;
  }

  public int potencia(int a, int b) {
    int r = 1;
    for (int i = 1; i <= b; i++) {
      r = r * a;
    }
    return r;
  }

  public int factorial(int n) {
    int factorial = 1;
    for (int i = 2; i <= n; ++i) {
      factorial *= i;
    }
    return factorial;
  }

  public int conversion(String hexa) {
    hexa = "7FFFFFFF";
    int decimal = Integer.parseInt(hexa, 16);
    return decimal;
  }

  public int digito(int n) {
    int factorial = 1;
    for (int i = 2; i <= n; ++i) {
      factorial *= i;
    }
    String longitud = Integer.toString(factorial);
    String cadena = longitud.substring(0,-1);
    int res =Integer.parseInt(cadena);
    return res;
  }
}
