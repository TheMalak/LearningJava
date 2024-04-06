package abstractLesson;

public class Rectangle extends  GeometryFigure {
    protected Rectangle(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("draw a " + super.getClass().getSimpleName());
    }
}
