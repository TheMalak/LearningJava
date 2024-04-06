package interfaces1;

public class Main {
    public static void main(String[] args){
        IDatabaseAccess mysql = new Mysql();
        displayElement(mysql);
    }
    public static void displayElement(IDatabaseAccess element) {
        element.read();
    }
}
