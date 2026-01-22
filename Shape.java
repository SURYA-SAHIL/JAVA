class Shape {
    void draw() {
        System.out.println("DRAW SHAPE");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("DRAW CIRCLE");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
