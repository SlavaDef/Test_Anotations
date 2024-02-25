package org.example.exampleLection;

public class Summer {
    public static int sum(int... x) {
        int res = 0;
        for (int i : x) {
            res += i;
        }
        return res;
    }

    @Test
    public static boolean testMe(){
        return (sum(1,2,3,4) == 10);
    }
}
