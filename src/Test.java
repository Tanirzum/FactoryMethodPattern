public class Test {
    public static void main(String[] args) {
        Developer developerFactory = factoryDeveloperSpecical("java");
        DeveloperFactory dev = developerFactory.writeDeveloper();
    }

    static Developer factoryDeveloperSpecical(String developerValue) {
        if (developerValue.equalsIgnoreCase("Java")) {
            return new JavaDeveloper();
        } else if (developerValue.equalsIgnoreCase("Cpp")) {
            return new CppDeveloper();
        } else {
            throw new RuntimeException(developerValue + " is not a developer");
        }
    }
}
