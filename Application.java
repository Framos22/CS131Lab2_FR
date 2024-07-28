
public class Application {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Harry Potter", 100);

        System.out.println("Name: " + wizard.getName());
        System.out.println("Health: " + wizard.getHealth());

        wizard.takeDamage(35);
        System.out.println("Health Status after taking damage: " + wizard.getHealth());

        wizard.setKey(3456);
        wizard.lock(3456);
        wizard.takeDamage(35);
        System.out.println("Health Status after taking damage while locked: " + wizard.getHealth());

        wizard.unlock(3456);
        wizard.takeDamage(35);
        System.out.println("Health Status after taking damage after unlocking: " + wizard.getHealth());
    }
}
