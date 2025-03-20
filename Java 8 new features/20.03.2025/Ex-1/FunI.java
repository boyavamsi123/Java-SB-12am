interface FunI{
    int squareIt(int num);
}
class FunImpl implements FunI{
    public int squareIt(int num){
        return num*num;
    }
    public static void main(String[] args) {
        FunI obj = new FunImpl();
        System.out.println(obj.squareIt(10));
    }
}