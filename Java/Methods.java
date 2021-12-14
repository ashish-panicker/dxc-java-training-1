public class Methods {

    public static void main(String[] args) {
        Math sum = new Math();
        int res = 0;
        res = sum.add(1, 2, 3, 4, 5 ,6);
        System.out.println(res);
        res = sum.add(1, 2, 3, 4, 5 ,6, 3, 4, 56, 7, 8, 9, 0);
        System.out.println(res);
    }
}


class Math {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3) {
        return (number1 + number2 + number3);
    }
    
    public int add(int... numbers){
        System.out.println( "Length = " + numbers.length);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
