import java.util.ArrayList;
public class Main {
    public static void main(String[] argc) {
        Quadrangle quadrangle1 = new Quadrangle(1, 2, 3, 2, 3, -2, 1, -2);
        System.out.println(quadrangle1.toString());

        Quadrangle quadrangle2 = new Quadrangle(90, 2, 3, 2, 3, -2, 1, -7);
        System.out.println(quadrangle2.toString());

        Quadrangle quadrangle3 = new Quadrangle(9, 2, 3, 2, 3, -2, 5, 17);
        System.out.println(quadrangle3.toString());

        Square square1 = new Square( 1,1,3,1,1,-1,3,-1 );
        System.out.println(square1.toString());
        Square square2 = new Square( 1,1,3,1,1,-1,3,-1 );
        System.out.println(square2.toString());
        Square square3 = new Square( 1,1,3,1,1,-1,3,-1 );
        System.out.println(square3.toString());


        ArrayList<Quadrangle>arrquadrangle=new ArrayList<>();
        arrquadrangle.add(quadrangle1);
        arrquadrangle.add(quadrangle2);
        arrquadrangle.add(quadrangle3);

        quadrangle1.getMaxArea(arrquadrangle);
        quadrangle1.getMinArea(arrquadrangle);



      ArrayList<Square>arrOfSquares = new ArrayList<>();
        arrOfSquares.add(square1);
        arrOfSquares.add(square2);
        arrOfSquares.add(square3);

       // square1.getSameSquare(arrOfSquares);
    }
}
