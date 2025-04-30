class CounterDemo {
    static int staticCount;
    int nonStaticCount;

    void increment() {
        staticCount++;
        nonStaticCount++;
    
        System.out.println("Object Hash: " + this.hashCode());
        System.out.println("Static Count : " + staticCount + " Non Static Count: " + nonStaticCount);
    }
    

    public static void main(String []args){
        CounterDemo cnt1 = new CounterDemo();
        CounterDemo cnt2 = new CounterDemo();
        CounterDemo cnt3 = new CounterDemo();

        cnt1.increment();
        cnt2.increment();
        cnt3.increment();

    }


    

}