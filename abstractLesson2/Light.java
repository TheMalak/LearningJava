package abstractLesson2;

public class Light extends Bill {

    private final String lightWatts;

    public String getLightWatts() {
        return lightWatts;
    }


    public Light(int id, String name, double total, String lightWatts) {
        super(id, name, total);
        this.lightWatts = lightWatts;
    }

    @Override
    public void showType() {
        System.out.println("this is a " + this.getClass().getSimpleName() + " bill");
        System.out.println("bill description: ");
        System.out.println(super.toString());
        System.out.println("Watts consumed" + this.getLightWatts());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
