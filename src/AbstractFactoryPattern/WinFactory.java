package AbstractFactoryPattern;

public class WinFactory extends Factory {

    @Override
    protected Button createButton() {
        System.out.println("Button Created in Windows");
        return new WinButton();
    }
}
