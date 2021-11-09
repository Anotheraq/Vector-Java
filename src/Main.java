import vector.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(1, 2);
        Polar2DAdapter polar2DAdapter = new Polar2DAdapter(vector2D);
        Polar2DInheritance polar2DInheritance = new Polar2DInheritance(5, 3);

        System.out.println("2D Vector: ");
        System.out.println("Value:\t\t " + Arrays.toString(vector2D.getComponents()));
        System.out.println("cdot:\t\t" + vector2D.cdot(polar2DAdapter));
        System.out.println("cdot:\t\t" + vector2D.cdot(polar2DInheritance));
        System.out.println("abs:\t\t" + vector2D.abs());

        System.out.println("\nPolar 2D Inheritance: ");
        System.out.println("Value:\t\t " + Arrays.toString(polar2DInheritance.getComponents()));
        System.out.println("cdot:\t\t" + polar2DInheritance.cdot(vector2D));
        System.out.println("cdot:\t\t" + polar2DInheritance.cdot(polar2DAdapter));
        System.out.println("angle:\t\t" + polar2DInheritance.getAngle());

        System.out.println("\nPolar 2D Adapter: ");
        System.out.println("Value:\t\t " + Arrays.toString(polar2DAdapter.getComponents()));
        System.out.println("cdot:\t\t" + polar2DAdapter.cdot(vector2D));
        System.out.println("cdot:\t\t" + polar2DAdapter.cdot(polar2DInheritance));
        System.out.println("angle:\t\t" + polar2DAdapter.getAngle());


        System.out.println("\n\n3D");

        Vector3DInheritance vector3DInheritance = new Vector3DInheritance(1, 2, 3);
        Vector3DDecorator vector3DDecorator = new Vector3DDecorator(vector2D, 4);

        System.out.println("\nVector 3D Inheritance: ");
        System.out.println("Value:\t\t " + Arrays.toString(vector3DInheritance.getComponents()));
        System.out.println("dot:\t\t" + vector3DInheritance.cdot(vector3DDecorator));
        System.out.println("cross:\t\t" + Arrays.toString(vector3DInheritance.cross(vector3DDecorator).getComponents()));

        System.out.println("\nVector 3D Decorator: ");
        System.out.println("Value:\t\t " + Arrays.toString(vector3DDecorator.getComponents()));
        System.out.println("dot:\t\t" + vector3DDecorator.cdot(vector3DInheritance));
        System.out.println("cross:\t\t" + Arrays.toString(vector3DDecorator.cross(vector3DInheritance).getComponents()));
    }
}
