package AbstractFactoryPattern;

public class AbstractFactory {
    Factory getFactory(String factoryString) {
        if("Windows".equalsIgnoreCase(factoryString)) {
            return new WinFactory();
        }
        else {
            return new LinuxFactory();
        }
    }
}
