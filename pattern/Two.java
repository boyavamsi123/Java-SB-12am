class Two{
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(j==1||j==7||(i==j))
                    System.out.println("+");
                else
                     System.out.println("");    
            }
            System.out.println();
        }
    }
}