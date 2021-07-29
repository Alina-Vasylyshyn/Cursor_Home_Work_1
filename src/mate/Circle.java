public class Circle {
    private static double radius;
    private static double diameter;

    public double square(double radius){
        double square =  Math.PI * Math.pow(radius,2);
        System.out.println("Площа круга: " + square);
        return square;

    }

    public double length(double diameter) {
        double length = Math.PI * diameter;
        System.out.println("Довжина кола: " + length);
        return length;
    }
}

   /* Circle circle1 = new Circle();
            circle1.length(3.0);
                    circle1.square(2.0);

                    int count = 1;
                    for (int i = 0; i <  150; i++) {
        if (i % 2 != 0 && count < 56) {
        System.out.println("Enter number " + count + ": " + i);
        count++;
        }
        }
        double [] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = Math.random();
        System.out.println(numbers[i]);
        }
        double max = numbers[0];
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > max){
        max = numbers[i];
        }
        if (numbers[i] < min) {
        min = numbers[i];
        }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
*/