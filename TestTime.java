class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set their time using setTime method
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times using toString() method
        System.out.println("Final time t1: " + t1);
        System.out.println("Final time t2: " + t2);
    }
}