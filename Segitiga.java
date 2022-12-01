public class Segitiga {
    Titik a, b, c;

    public Segitiga(Titik a, Titik b, Titik c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getKeliling(){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        return (x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1) / 2;
    }
    public double getLuas(){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        return Math.sqrt(
                Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2))
                + Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2))
                + Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }
}
