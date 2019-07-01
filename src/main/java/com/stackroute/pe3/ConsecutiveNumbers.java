package com.stackroute.pe3;


public class ConsecutiveNumbers {
    public String checkConsecutive(String numbers) {
        String[] numberArray = numbers.split(",");
        int difference = Integer.parseInt(numberArray[1]) - Integer.parseInt(numberArray[0]);
        boolean flag = false;
        for (int i = 2; i < 7 ;i++){
            if (difference != Integer.parseInt(numberArray[i])-Integer.parseInt(numberArray[i-1])){
                flag = true;
                break;
            }
        }
        if (flag){
            return  String.join(",",numbers)+" are not consecutive numbers";
        }
        else {
            return String.join(",",numbers)+" are consecutive numbers";
        }
    }
}
