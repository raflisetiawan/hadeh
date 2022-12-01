public class Main{
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(
                new Titik(-2, 3),
                new Titik(-3, -1),
                new Titik(3, -2)
        );
        System.out.println(segitiga.getKeliling());
        System.out.println(segitiga.getLuas());
    }
}