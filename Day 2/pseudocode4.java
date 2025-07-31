public class pseudocode4 {
	static int func(int a, int b) {
        for (int c = 2; c <= 4; c++) {
            if (a != 0 && b > 2) {
                a = 4 % 3; 
            } else {
                if (5 % 3 > b) { 
                    a = b;
                }
                b = 1;
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        int result = func(0, 2);
        System.out.println(result); 
    }
}