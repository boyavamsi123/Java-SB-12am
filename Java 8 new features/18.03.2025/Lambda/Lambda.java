class Lambda{
    public static void main(String[] args) {
        /* Circle c = (double radius)->{
                                       System.out.println(Math.PI * radius * radius);  //28.274333882308138
                                    }; */

        Circle c = r -> System.out.println(Math.PI * r * r);
        c.calArea(3.0);
    }
}