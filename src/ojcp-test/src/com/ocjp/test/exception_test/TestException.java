package com.ocjp.test.exception_test;

public class TestException {

    public static void main(String[] args) {

        int arr[] = new int[4];

        arr[0] = 1;

        arr[1] = 2;

        arr[2] = 4;

        arr[3] = 5;

        int sum = 0;

        try {

            for (int pos = 0; pos <= 4; pos++) {

                sum = sum + arr[pos];

            }
        } catch (Exception e) {

            e.printStackTrace();
        }

		//上面异常被捕捉后，方法不会结束，这里还会打印输出。
        System.out.println(sum);

    }

}
