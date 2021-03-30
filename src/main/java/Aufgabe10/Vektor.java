package Aufgabe10;

public class Vektor {

    private final double x;
    private final double y;
    private final double z;

    public Vektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vektor additionVektor(Vektor vektor1, Vektor vektor2) {
        Double returnVektorX = vektor1.getX() + vektor2.getX();
        Double returnVektorY = vektor1.getY() + vektor2.getY();
        Double returnVektorZ = vektor1.getZ() + vektor2.getZ();
        return new Vektor(returnVektorX, returnVektorY, returnVektorZ);
    }

    public static Vektor subtractVektor(Vektor vektor1, Vektor vektor2) {
        Double returnVektorX = vektor1.getX() - vektor2.getX();
        Double returnVektorY = vektor1.getY() - vektor2.getY();
        Double returnVektorZ = vektor1.getZ() - vektor2.getZ();
        return new Vektor(returnVektorX, returnVektorY, returnVektorZ);
    }

    public static Vektor crossProductOfVektors(Vektor vektor1, Vektor vektor2) {
        Double returnVektorX = ((vektor1.getY() * vektor2.getZ()) - (vektor1.getZ() * vektor2.getY()));
        Double returnVektorY = ((vektor1.getZ() * vektor2.getX()) - (vektor1.getX() * vektor2.getZ()));
        Double returnVektorZ = ((vektor1.getX() * vektor2.getY()) - (vektor1.getY() * vektor2.getX()));
        return new Vektor(returnVektorX, returnVektorY, returnVektorZ);
    }

    public static Vektor multiplyVektorWithScalar(Vektor vektor1, Double scalar) {
        return new Vektor(vektor1.getX() * scalar,
                    vektor1.getY() * scalar,
                    vektor1.getZ() * scalar);
    }

    public static Vektor divideVektorWithScalar(Vektor vektor1, Double scalar) {
        return new Vektor(vektor1.getX() / scalar,
                    vektor1.getY() / scalar,
                    vektor1.getZ() / scalar);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vektor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
