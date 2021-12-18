package com.bergan.app;

public class UsefulMethods {

    public static void updateWinningArrays(int square) {
        switch (square) {
            case 1:
                if (Main.flipper) {
                    Main.xArray[1]++;
                    Main.xArray[4]++;
                    Main.xArray[7]++;
                } else {
                    Main.oArray[1]++;
                    Main.oArray[4]++;
                    Main.oArray[7]++;
                }
                break;
            case 2:
                if (Main.flipper) {
                    Main.xArray[1]++;
                    Main.xArray[5]++;
                } else {
                    Main.oArray[1]++;
                    Main.oArray[5]++;
                }
                break;
            case 3:
                if (Main.flipper) {
                    Main.xArray[1]++;
                    Main.xArray[6]++;
                    Main.xArray[8]++;
                } else {
                    Main.oArray[1]++;
                    Main.oArray[6]++;
                    Main.oArray[8]++;
                }
                break;
            case 4:
                if (Main.flipper) {
                    Main.xArray[2]++;
                    Main.xArray[4]++;
                } else {
                    Main.oArray[2]++;
                    Main.oArray[4]++;
                }
                break;
            case 5:
                if (Main.flipper) {
                    Main.xArray[2]++;
                    Main.xArray[5]++;
                    Main.xArray[7]++;
                    Main.xArray[8]++;
                } else {
                    Main.oArray[2]++;
                    Main.oArray[5]++;
                    Main.xArray[7]++;
                    Main.oArray[8]++;
                }
                break;
            case 6:
                if (Main.flipper) {
                    Main.xArray[2]++;
                    Main.xArray[6]++;
                } else {
                    Main.oArray[2]++;
                    Main.oArray[6]++;
                }
                break;
            case 7:
                if (Main.flipper) {
                    Main.xArray[3]++;
                    Main.xArray[4]++;
                    Main.xArray[8]++;
                } else {
                    Main.oArray[3]++;
                    Main.oArray[4]++;
                    Main.oArray[8]++;
                }
                break;
            case 8:
                if (Main.flipper) {
                    Main.xArray[3]++;
                    Main.xArray[5]++;
                } else {
                    Main.oArray[3]++;
                    Main.oArray[5]++;
                }
                break;
            case 9:
                if (Main.flipper) {
                    Main.xArray[3]++;
                    Main.xArray[6]++;
                    Main.xArray[7]++;
                } else {
                    Main.oArray[3]++;
                    Main.oArray[6]++;
                    Main.oArray[7]++;
                }
                break;
            default:
                // todo not sure what to do here
        }
    }

}
