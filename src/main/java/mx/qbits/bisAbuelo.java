package mx.qbits;

public class bisAbuelo {
  public String nombre = "kix";
  public int pow(int a, int b) {
    int r = 1;
    for (int i = 1; i <= b; i++) {
      r = r * a;
    }
    return r;
  }
}
