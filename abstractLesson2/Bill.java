package abstractLesson2;

abstract class Bill {
    protected int id;
    protected String name;
    protected double total;


    public Bill(int id, String name, double total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bill{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }

    abstract void showType();
}