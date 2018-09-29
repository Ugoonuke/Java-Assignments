public class haversine {
  public static void main(String[] args) {
    double rad = 6371;
    double la1 = 53.3812896;
    double lo1 = -6.591849899999943;
    double la2 = 39.0366364;
    double lo2 = 125.73091870000007;
    System.out.print(Haversine(la1, lo1, la2, lo2)*rad);
  }

  public static double Haversine(double la1, double lo1, double la2, double lo2) {
    double dLa = Math.toRadians(la2 - la1);
    double dLo = Math.toRadians(lo2 - lo1);
    la1 = Math.toRadians(la1);
    la2 = Math.toRadians(la2);
    double p1 = Math.pow(Math.sin(dLa/2),2)+Math.pow(Math.sin(dLo/2),2)*Math.cos(la1)*Math.cos(la2);
    double p2 = 2 * Math.asin(Math.sqrt(p1));
    return p2;
  }
}
