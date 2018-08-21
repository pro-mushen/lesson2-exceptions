import ru.innopolis.lesson2.FactorialExceprion;
import ru.innopolis.lesson2.MathBox;

public class Main {

    public static void main (String[] arg){
        MathBox mathBox = new MathBox();


        System.out.println (mathBox.dividerExceptionInside(10,0));
        try{
            System.out.println (mathBox.divider(10,0));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println (mathBox.factorialFor(22));
        }catch (FactorialExceprion e){
            System.out.println(e.getMessage());
            System.out.println("Был указан " + e.getNumber());
        }

        System.out.println (mathBox.factorialStack(100000000));

    }


}
