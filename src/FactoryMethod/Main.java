package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        DOMFactory domFactory = new DOMFactory();
        Document document = domFactory.createElement("div");
        document.render();
        Document document2 = domFactory.createElement("section");
        document2.render();
    }
}
