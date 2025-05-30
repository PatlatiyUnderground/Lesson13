public class ArithmeticCalculator {

    int a, b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation type){
        if (type == Operation.ADD){
            System.out.println(a + b);
        }else if (type == Operation.SUBTRACT){
            System.out.println(a - b);
        }else if (type == Operation.MULTIPLY){
            System.out.println(a * b);
        }else System.out.println("null");
    };
}
