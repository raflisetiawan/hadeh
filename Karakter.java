public class Karakter {
    String nama;
    int level;

    public Karakter(String nama, int level) {
        this.nama = nama;
        this.level = level;
    }

    public Karakter(String nama) {
        this.nama = nama;
        this.level = 1;
    }

    public String getNama() {
        return nama;
    }

    public int getLevel() {
        return level;
    }
}
