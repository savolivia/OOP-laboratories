package Laboratory_7;

public class GeometricBodyController {
    static public double getBiggestSurface(GeometricBody[] bodies){
        double maxSurface = 0;
        for(int i = 0;i<bodies.length;i++)
        {
            if( maxSurface < bodies[i].getSurface())
            {
                maxSurface = bodies[i].getSurface();
            }
        }
        return maxSurface;
    }

    static public double getBiggestVolume(GeometricBody[] bodies){
        double maxVolume = 0;
        for(int i = 0;i<bodies.length;i++)
        {
            if( maxVolume < bodies[i].getVolume())
            {
                maxVolume = bodies[i].getVolume();
            }
        }
        return maxVolume;
    }
}
