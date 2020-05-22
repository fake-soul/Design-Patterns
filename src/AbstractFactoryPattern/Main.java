package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory aF = new AbstractFactory();
        Factory system = aF.getFactory("linux");
        Button b1 = system.createButton();
        b1.render();
    }
}
