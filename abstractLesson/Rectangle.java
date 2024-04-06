package abstractLesson;

public class Rectangle extends  GeometryFigure {
    protected Rectangle(String figureType) {
        super(figureType);
    }

    @Override
    void draw() {
        System.out.println("draw a " + super.figureType);
    }
}
