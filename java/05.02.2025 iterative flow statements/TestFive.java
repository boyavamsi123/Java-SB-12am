class Test{
    public static void main(String[] args){
        int i=1;
        while(i<=100){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
            i++;
        }
    }
}