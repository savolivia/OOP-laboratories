public class Laboratory101 {
    public static void main(String... args) {
        compareObjects();
    }

    static void compareObjects() {
        Monitor monitor = new Monitor();
        Monitor monitor2 = new Monitor();

        monitor.color = "blue";
        monitor.dimensions = new int[]{120, 220};
        monitor.resolution = new int[]{111, 222};

        monitor2.color = "black";
        monitor2.dimensions = new int[]{125, 230};
        monitor2.resolution = new int[]{1110, 2220};

        if (monitor.resolution[0] > monitor2.resolution[0]) {
            System.out.println("First monitor has bigger resolutions!");
        } else if (monitor.resolution[0] < monitor2.resolution[0]) {
            System.out.println("Second monitor has bigger resolutions!");
        } else if (monitor.resolution[0] == monitor2.resolution[0] && monitor.resolution[1] == monitor2.resolution[1]) {
            System.out.println("Resolutions are equal!");
        }
        System.out.println("For monitor 1 the color is: " + monitor.color + ", but for monitor 2 the color is: " + monitor2.color);
        if (monitor.dimensions[0] > monitor2.dimensions[0]) {
            System.out.println("First monitor has bigger dimensions!");
        } else if (monitor.dimensions[0] < monitor2.dimensions[0]) {
            System.out.println("Second monitor has bigger dimensions!");
        } else if (monitor.dimensions[0] == monitor2.dimensions[0] && monitor.dimensions[1] == monitor2.dimensions[1]) {
            System.out.println("Dimensions are equal!");
        }
    }
}


