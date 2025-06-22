public class TestBuilderPattern {
    public static void main(String[] args) {
        // Basic configuration (Only required parts)
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB").build();
        basicComputer.displayConfiguration();

        // Gaming configuration
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11 Pro")
                .build();
        gamingComputer.displayConfiguration();

        // Developer configuration
        Computer devComputer = new Computer.Builder("AMD Ryzen 7", "32GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("NVIDIA GTX 1660")
                .setOperatingSystem("Ubuntu 22.04")
                .build();
        devComputer.displayConfiguration();
    }
}
