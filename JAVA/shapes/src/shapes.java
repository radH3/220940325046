import java.awt.*;
public class shapes {
    public static void main(String[] args) {
        shape c = new circle();
        c.draw();
        c.erase();
        shape t = new triangle();
        t.draw();
        t.erase();
        shape s = new square();
        s.draw();
        s.erase();
    }
}
abstract class shape{
    abstract void draw();
    abstract void erase();
}
class circle extends shape{
    @Override
    void draw() {
        System.out.println("Drawing a Cricle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}
class triangle extends shape{
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}
class square extends shape{
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}






