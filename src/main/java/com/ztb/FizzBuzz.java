package com.ztb;

/**
 * Created by z on 2017/8/10.
 */
public class FizzBuzz {
    int firstNum;
    int secondNum;
    int thirdNum;

    public void setFirstnum(int first, int second, int third) {
        this.firstNum = first;
        this.secondNum = second;
        this.thirdNum = third;
    }

    public String play(int num) {
        if (num % firstNum == 0) {
            return "Fizz";
        }
        if (num % secondNum == 0) {
            return "Buzz";
        }
        if (num % thirdNum == 0) {
            return "Whizz";
        }

        return num + "";
    }
}
