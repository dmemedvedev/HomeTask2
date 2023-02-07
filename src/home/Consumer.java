public class Consumer {
    private int count = 0;
    private int length = 5;
    private int[] array = new int[length];

    public Consumer() {
    }

    public void consume(int arg) {
        int i = count % length;
        array[i] = arg;
        count++;
    }

    public Double avg() {
        double result = 0;
        int div = count % length;
        for (int i = 0; i < array.length; i++)
            result += array[i];
        if (count >= length) {
            return result / length;
        } else {
            return result / div;
        }
    }

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume(1);//
                consumer.consume(1);
                consumer.consume(1);
                System.out.println(consumer.avg());
    }
}
