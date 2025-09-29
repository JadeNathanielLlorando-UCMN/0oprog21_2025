import java.util.Scanner;

public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color;
        String point;

        DebugPen pen1;
        DebugPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();
        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        pen1 = new DebugPen();              // default pen
        pen2 = new DebugPen(color, point);  // user-supplied pen

        System.out.println("Default value pen:");
        display(pen1);
        System.out.println("User value pen:");
        display(pen2);

        input.close();
    }

    public static void display(DebugPen p) {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");
    }
}

class DebugPen {
    private String color;
    private String point;

    private static final String DEFAULT_COLOR = "blue";
    private static final String DEFAULT_POINT = "medium";

    public DebugPen() {
        this.color = DEFAULT_COLOR;
        this.point = DEFAULT_POINT;
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}
