public class Rect {

    int width;
    int length;

    public Rect(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int area() {
        return this.width * this.length;
    }

    public static void main(String[] args) {

        Rect rect = new Rect(100, 100);

        System.out.println( rect.area() );

    }

}
