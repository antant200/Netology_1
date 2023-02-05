public class Main {
    public static void main(String[] args) {
        long[] sales = {10, 115, 4, 1101};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.cropped());
    }
}


