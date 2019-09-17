import java.util.ArrayList;
import lombok.Setter;
import lombok.Getter;
public class Quadrangle {


    public Quadrangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {//Конструктор
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    @Setter
    @Getter
    private int x1, y1, x2, y2, x3, y3, x4, y4;

    int getSide_A() {
        return (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    int getSide_B() {
        return (int) Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
    }

    int getSide_C() {
        return (int) Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
    }

    int getSide_D() {
        return (int) Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
    }

    double getD1() {
        return Math.sqrt(Math.pow((x4 - x2), 2) + Math.pow((y4 - y2), 2));
    }

    double getD2() {
        return Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
    }

    double getPerimeter() {
        return getSide_A() + getSide_B() + getSide_C() + getSide_D();
    }

    double getArea() {
        double half_perimeter = getPerimeter() / 2;
        return Math.sqrt((half_perimeter - getSide_A()) * (half_perimeter - getSide_B()) * (half_perimeter - getSide_C()) * (half_perimeter - getSide_D()));
    }

    @Override
    public String toString() {
        return "Сторона четырехугольника А = " + getSide_A() +
                "; Сторона четырехугольника B = " + getSide_B() +
                "; Сторона четырехугольника C = " + getSide_C() +
                "; Сторона четырехугольника D = " + getSide_D() +
                "; Диагональ четырехугольника d1 = " + String.format("%6.2f", getD1()) +
                "; Диагональ четырехугольника d2= " + String.format("%6.2f", getD2()) +
                "; Периметр четырехугольника = " + getPerimeter() +
                "; Площадь четыреугольника = " + getArea();
    }

    public void getMaxArea(ArrayList<Quadrangle> quadrangle) {
        double max = quadrangle.get(0).getArea();
        for (Quadrangle i : quadrangle) {
            if (i.getArea() > max) {
                max = i.getArea();
            }

        }
        System.out.println("Найбольшая площадьчетырехугольника :" + max);
    }

    public void getMinArea(ArrayList<Quadrangle> quadrangles) {
        double min = quadrangles.get(0).getArea();
        for (Quadrangle i : quadrangles) {
            if (i.getArea() < min) {
                min = i.getArea();
            }

        }
        System.out.println("Найменьшая площадьчетырехугольника :" + min);
    }
}


