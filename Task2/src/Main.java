import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



//  1.Реализуйте конструктор с двумя параметрами-числами, который сохраняет переданные числа в свойствах класса.

//  2.Реализуйте метод calculate, на вход которого передаётся одна из арифметических операций
//  (объект класса Operation — смотрите следующий пункт задания), которую нужно произвести с двумя числами,
//  переданными в конструктор при создании объекта.
//  3.Создайте Enum Operation с тремя значениями: ADD, SUBTRACT, MULTIPLY.
//   Эти значения будут соответствовать арифметическим операциям — сложению, вычитанию и умножению.


            ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5, 2);
            arithmeticCalculator.calculate(Operation.MULTIPLY);



    }
}
