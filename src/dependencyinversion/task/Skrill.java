package dependencyinversion.task;

public class Skrill implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with skrill...");
    }

}
