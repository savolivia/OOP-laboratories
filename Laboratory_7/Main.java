package Laboratory_7;

public class Main {

    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(7);
        Parallelepiped parallelepiped= new Parallelepiped(5 ,6,7);

        GeometricBody[] bodies = { sphere , cube,parallelepiped};
        GeometricBodyController controller = new GeometricBodyController();

        System.out.println("The volume of the sphere:"+sphere.getVolume());
        System.out.println("The volume of the cube:"+cube.getVolume());
        System.out.println("The volume of the Parallelepiped:"+parallelepiped.getVolume()+"\n");

        System.out.println("The surface of the sphere:"+sphere.getSurface());
        System.out.println("The surface of the cube:"+cube.getSurface());
        System.out.println("The surface of the Parallelepiped:"+parallelepiped.getSurface()+"\n");

        System.out.println("The biggest volume"+controller.getBiggestVolume(bodies));
        System.out.println("The biggest surface"+controller.getBiggestSurface(bodies));

    }
}
