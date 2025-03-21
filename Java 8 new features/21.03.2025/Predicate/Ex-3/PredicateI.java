interface PredicateI{
    public abstract boolean test(String enames);
}

class PredicateEx2 implements PredicateI{
    public boolean test(String enames){
        return enames.length()>5;
    }
    public static void main(String[] args) {
        PredicateI obj = new PredicateEx2();
        System.out.println(obj.test("Rahul Gandhi"));
        System.out.println("Ravi");
    }
}