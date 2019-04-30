import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import java.io.InputStream;

@Singleton
public class ProfileJPanel extends JPanel {

    @Inject
    public ProfileJPanel(){

        System.out.println("Create Profile JPanel");


        InputStream labelsStream = Labels.class.getClassLoader().getResourceAsStream("messages.properties");
        if (labelsStream == null){
            System.out.println("null here");
        } else {
            System.out.println("not null");
        }

        System.out.println(Labels.getLabel("gui.connection.connection"));
    }
}
