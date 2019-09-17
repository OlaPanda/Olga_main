import java.util.ArrayList;
import java.util.List;

public class Square extends Quadrangle {
    public Square(int x1, int y1, int x2, int y2, int x3 , int y3 , int x4 , int y4) {
       super(x1,y1,x2,y2,x3,y3,x4,y4);
        checkSquare(getSide_A(), getSide_B(), getSide_C() , getSide_D());
    }

    @Override
    public String toString () {
        return "Сторона квадрата А = " + getSide_A() +
                "; Сторона квадрата B = " + getSide_B() +
                "; Сторона квадрата C = " + getSide_C() +
                "; Сторона квадрата D = " + getSide_D() +
                "; Диагональ квадрата d1 = " + getD1() +
                "; Диагональ квадрата d2= " + getD2() +
                "; Периметр квадрата = " + getPerimeter() +
                "; Площадь квадрата = " + getArea() ;
    }
    private void checkSquare(int sideA, int sideB, int sideC, int sideD){
        if((getSide_A()!=getSide_B())|(getSide_B()!=getSide_C())|(getSide_C()!=getSide_D())){
            throw new IllegalArgumentException("Фигура не являеться квадратом, проверьте правильность вводимых данных !");
        }

    }
   /* List<Square> list = new ArrayList<String>();
    Map<String, Integer> mp2 = new HashMap<String, Integer>();
list.add("aaa");
list.add("bbb");
list.add("aaa");

    Set<String> unique = new HashSet<String>(list);
for (String key : unique) {
        mp2.put(key, Collections.frequency(list, key));
    }

System.out.println(mp2);*/

}

