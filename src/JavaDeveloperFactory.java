public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer developerFactoryLanguage() {
        return new JavaDeveloper();
    }
}
