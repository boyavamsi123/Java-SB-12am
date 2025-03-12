public class Array{
    
    public static void main(String[] args){
        int[] eids = new int[4];
       eids[0] = 101;
       eids[2] = 103;

       System.out.println(eids);     //[I@372f7a8d
       System.out.println(eids[0]);  //101
       System.out.println(eids[1]);  //0
       System.out.println(eids[2]);  //103
       System.out.println(eids[3]);  //0

    }
}