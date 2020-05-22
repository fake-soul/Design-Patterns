package AbstractFactoryPattern;

public class LinuxFactory extends Factory {
    @Override
    protected Button createButton() {
        System.out.println("Button Created in linux");
        return new LinuxButton();
    }
}
