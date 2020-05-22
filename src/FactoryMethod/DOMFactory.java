package FactoryMethod;

public class DOMFactory {
    Document createElement(String name) {
        if("div".equalsIgnoreCase(name)) {
            return new Div();
        }
        else {
            return new Section();
        }
    }
}
