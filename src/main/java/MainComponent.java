import dagger.Component;

import javax.inject.Singleton;

@Component(modules = {
        ConfigModule.class
})

@Singleton
public interface MainComponent {
        MainWindow createMainWindow();
        void inject(MainWindow mv);
    }
