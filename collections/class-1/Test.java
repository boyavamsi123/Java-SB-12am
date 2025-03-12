public class Test{
    public static void main(String[] args) {
        Object[] obj = new Object[4];

        obj[0] = "Rahul";
        obj[1] = 101;
        obj[2] = 45000.45;
        obj[3] = "y";
        
        System.out.println(obj);     //[Ljava.lang.Object;@372f7a8d
        System.out.println(obj[0]);  // Rahul
        System.out.println(obj[1]);  // 101
        System.out.println(obj[2]);  // 45000.45
        System.out.println(obj[3]);  // y
    }
}