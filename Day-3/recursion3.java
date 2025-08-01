public class recursion3{
    public static int func(int x, int y){
        if(y==0 || y==x){
            return 1;
        }
        return func(x-1,y)+ func(x-1,y-1);
    }
    public static void main(String[] args){
        int result=func(5,3);
        System.out.print(result);
    }
}