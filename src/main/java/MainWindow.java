import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainWindow {
    @Inject
    Lazy<ProfileJPanel> profileJPanel;

    private SecondWindow secondWindow;

    @Inject
    public MainWindow(SecondWindow secondWindow){
        this.secondWindow = secondWindow;
        System.out.println(secondWindow.getClass());
    }

    public void checkProfileJPanel(){
        System.out.println(profileJPanel.get().getName());
    }
}
