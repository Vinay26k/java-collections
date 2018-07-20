interface MathOperation{
    int operation(int a, int b);
}

class LambdaExpressionsExample{
    public static void main(String[] args) {
        LambdaExpressionsExample test = new LambdaExpressionsExample();

        //with type declaration
        MathOperation addition = (int a, int b) -> a+b;

        //without type declaration
        MathOperation subtraction = (a,b)-> a-b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b)->{return a*b;};

        //without return statement and without curly braces
        MathOperation division = (int a, int b)->a/b;

        System.out.println("Add : "+ test.operate(10,5,addition));
        System.out.println("Sub : "+ test.operate(10,5,subtraction));
        System.out.println("Mul : "+ test.operate(10,5,multiplication));
        System.out.println("Div : "+ test.operate(10,5,division));

        GreetingService gs1 = message -> System.out.println("Hello "+message);
        GreetingService gs2 = message -> System.out.println("Hello "+message);

        gs1.sayMessage("World!!");
        gs2.sayMessage("World!!!!!");
    }
    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);        
    }
}