

interface PredicateOne{
    public abstract boolean  test(String ename);
}
class PredicateEx2{
    public static void main(String[] args) {
    PredicateOne p = ename -> ename.length()>5;
        System.out.println(p.test("R     G"));   //true
        System.out.println(p.test("Ravi"));      //false

    }
}