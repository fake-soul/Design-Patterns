package AbstractFactoryPattern;

public class LinuxButton extends Button {

    @Override
    protected void render() {
        System.out.println("Button Clicked in Linux");
    }
}
