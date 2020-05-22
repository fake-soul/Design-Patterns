package AbstractFactoryPattern;

public class WinButton extends Button {
    @Override
    protected void render() {
        System.out.println("Button Clicked in Windows");
    }
}
