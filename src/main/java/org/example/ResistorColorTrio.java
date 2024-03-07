package org.example;

public class ResistorColorTrio {
    public String label(String[] colors) {
        int mainValue = getColorValue(colors[0], colors[1]);
        int zeros = getZeros(colors[2]);
        String unit = getUnit(mainValue, zeros);
        return mainValue + " " + unit;
    }

    private int getColorValue(String color1, String color2) {
        int value = getColorDigit(color1) * 10 + getColorDigit(color2);
        return value;
    }

    private int getColorDigit(String color) {
        switch (color) {
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            case "white":
                return 9;
            default:
                return -1;
        }
    }

    private int getZeros(String color) {
        int zeros = 1;
        for (int i = 0; i < getColorDigit(color); i++) {
            zeros *= 10;
        }
        return zeros;
    }

    private String getUnit(int mainValue, int zeros) {
        if (mainValue >= 1000) {
            return "kiloohms";
        } else if (mainValue >= 1000000) {
            return "megaohms";
        } else if (mainValue >= 1000000000) {
            return "gigaohms";
        } else {
            return "ohms";
        }
    }
}
