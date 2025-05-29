class One{
    public void printOne(){
        System.out.println("printOne method of One class.");
    }
}

class Main{
    public static void main(String[] args) {
        One obj = new One();

        obj.printOne();
    }
}