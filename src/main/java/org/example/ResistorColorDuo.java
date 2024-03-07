package org.example;
enum ResistorColor {
    BLACK(0),
    BROWN(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6),
    VIOLET(7),
    GREY(8),
    WHITE(9);

    private final int value;

    ResistorColor(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
public class ResistorColorDuo {
    public int value(String[] colors) {
        // Initialize the result string with the first two colors
        String result = "";
        for (int i = 0; i < Math.min(colors.length, 2); i++) {
            result += ResistorColor.valueOf(colors[i].toUpperCase()).getValue();
        }

        // Parse the result string to an integer and return
        return Integer.parseInt(result);
    }
}
