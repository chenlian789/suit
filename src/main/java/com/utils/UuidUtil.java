package com.utils;

import java.util.Random;

public class UuidUtil {
    private static Random rand = new Random();
    public static String getUid(String suffix){
        StringBuilder sb = new StringBuilder(suffix);
        Integer num = rand.nextInt(999999);
        String numStr = num.toString();
        int len=numStr.length();
        for (int i=0 ; i<6-len ; i++){
            sb.append("0");
        }
        return sb.append(numStr).toString();
    }

    public static void main(String [] args){
        for(int i=0;i<50;i++){
            System.out.println(getUid("wx"));
        }
    }
}
