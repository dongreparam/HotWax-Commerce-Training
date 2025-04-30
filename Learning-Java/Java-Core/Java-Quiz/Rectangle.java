class Rectangle {

    int width;
    int height;

    Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    Rectangle(int wid, int h) {
        this.width = wid;
        this.height = h;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4, 5);

        System.out.println(rect1.area());  // Output: 1
        System.out.println(rect2.area());  // Output: 20
    }
}
