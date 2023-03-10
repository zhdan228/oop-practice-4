package XY;

public class Dot {
    int x;
    int y;
    int z;
    int z2;
    int x2;
    int y2;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dot(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Dot(int x, int y, int z, int z2, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.z2 = z2;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double len() {
        return Math.sqrt((int) ((Math.pow(x, 2) + Math.pow(y, 2))));
    }

    public double len2() {
        return Math.sqrt((int) Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
    }

    public double len3() {
        return Math.sqrt((int) Math.pow(x - x2, 2) + Math.pow(y - y2, 2) + Math.pow(z - z2, 2));
    }
}

