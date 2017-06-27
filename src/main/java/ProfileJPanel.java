import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;

@Singleton
public class ProfileJPanel extends JPanel {

    @Inject
    public ProfileJPanel(){
        System.out.println("Create Profile JPanel");
    }
}
