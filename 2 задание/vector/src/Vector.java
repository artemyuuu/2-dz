import java.util.Arrays;

public class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return "Vector(" + x + ", " + y +", " + z +")";
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double length(int x, int y, int z) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double dotProduct() {
        return Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
    }

    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public String vectorDotProduct(int x2, int y2, int z2){
        System.out.println("Результатом векторного произведения является вектор с координатами");
        int[] coordinates = new int[3];
        coordinates[0] = y*z2-y2*z;
        coordinates[1] = -1*(x*z2-x2*z);
        coordinates[2] = x*y2-x2*y;
        Vector vector = new Vector(coordinates[0],coordinates[1],coordinates[2]);
        return Arrays.toString(coordinates);
    }


    public double cosAngle(int x3, int y3, int z3) {
        return (x * x3 + y * y3 + z * z3) / (length() * length(x3, y3, z3));
    }

    public String difference(Vector other){
        System.out.println("Разность векторов:");
        int[] result = new int[3];
        result[0] = this.x - other.x;
        result[1] = this.y - other.y;
        result[2] = this.z - other.z;
        Vector vector = new Vector(result[0],result[1],result[2]);
        return Arrays.toString(result);
    }

}
