public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer developerFactoryLanguage() {
        return new CppDeveloper();
    }
}
