public class Main {
    public static void main(String... args) {
        long startTime = System.currentTimeMillis();

        MainComponent mainComponent = DaggerMainComponent.create();

        // create the main window using dependency injection
        MainWindow mainWindow = mainComponent.createMainWindow();
        mainComponent.inject(mainWindow);

        mainWindow.checkProfileJPanel();

    }
}
