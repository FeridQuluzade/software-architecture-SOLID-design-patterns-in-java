package dependencyinversion.task;

public class App {

    public static void main(String[] args) {
        WebStore store = new WebStore();
        store.purchaseItem();
    }

}
