package interfaces1;

public class Mysql implements IDatabaseAccess{

    @Override
    public void insert() {
        System.out.println("insert data on mysql");
    }

    @Override
    public void read() {
        System.out.println("read data on mysql");
    }

    @Override
    public void delete() {
        System.out.println("delete data on mysql");
    }

    @Override
    public void update() {
        System.out.println("update data on mysql");
    }
}
