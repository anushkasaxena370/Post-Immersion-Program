public class recursion4{
    public static int func(int x, int y){
        if(x==y){
            return x*y;
        }
        return func(x,(x+y)/2) + func(((x+y)/2) +1,y);
    }
    public static void main(String[] args){
        int result=func(2,7);
        System.out.print(result);
    }
}