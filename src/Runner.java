public class Runner {
    public static void main(String[] args) {
        WhileLoopFun fun = new WhileLoopFun();
        System.out.println(fun.factorial(4));
        fun.printDigits(12345);
        System.out.println(fun.sumOfDigits(150856));
        System.out.println(fun.isPrime(22));
        System.out.println(fun.maxDoubles(4, 20));
        System.out.println(fun.maxDoubles(2, 65));
        System.out.println(fun.maxDoubles(5, 500));
        System.out.println(fun.maxDoubles(2, 64));

    }
}
