package abstractLesson;

abstract class GeometryFigure {

    protected  String figureType;

    public String getFigureType() {
        return figureType;
    }
    protected GeometryFigure(String figureType){
        this.figureType = figureType;
    }
    abstract void draw();
}

