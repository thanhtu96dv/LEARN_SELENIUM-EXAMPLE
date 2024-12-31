package org.example;

import java.util.Random;

/**
 * Copyright (c) 2024 iNet Solutions Corp.
 *
 * @Project : Default (Template) Project
 * @File : ${NAME}
 * @Author : Le Thanh Tu (tult@inetcloud.vn)
 * @Since : 12:42 10/12/2024
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        int i = -1;
        String road = "--x--x--xx--x---x";
        int mickeyHP = 10;
        while (i < road.length()-1) {
            i++;
            if (rand.nextInt(2) == 1){
                continue;
            }
            if (road.charAt(i) == '-'){
                System.out.println("Mickey di them 1 buoc va mat 1 HP");
                mickeyHP --;

            }else {
                System.out.println("Mickey dap trung bom và mat 2 HP");
                mickeyHP -=2;
            }
            if (mickeyHP <= 0){
                System.out.println("Mickey da het HP tai vi tri " + i);
                break;
            }
        }
        if (i == road.length()-1){
            System.out.println("Chuc mung Mickey da di den dich!!!");
        }

    }
}