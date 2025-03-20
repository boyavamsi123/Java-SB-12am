interface TestI{
    public abstract int apply(String ename); 
}
class TestImpl implements TestI{
    public int apply(String ename){
        return ename.length();
    }
    public static void main(String[] args) {
        TestI obj = new TestImpl();
        System.out.println(obj.apply("Rahul"));
    }
}

//This is program for without lambda