package com.ocjp.test.string;

// Q102
class Alpha {
    public String[] main = new String[2];
    Alpha(String[] main) {
        for (int i = 0; i < main.length; i++) {
            this.main[i] = main[i] + 5;
        }
    }
    public void main() {
        System.out.print(main[0] + main[1]);
    }

}


public class ArgsTest {
    public static void main(String[] args) {
        Alpha main = new Alpha(args);
        main.main();
    }
}

// Commands:
// java ArgsTest 1 2
