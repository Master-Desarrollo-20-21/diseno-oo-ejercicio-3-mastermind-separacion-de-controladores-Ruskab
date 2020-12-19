package ikab.dev.mastermind.models;

public enum Color {

    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PINK('p');

    private final char colorCode;

    Color(char colorCode) {
        this.colorCode = colorCode;
    }

    public static Color of(char colorCode) {
        for (Color color : values()) {
            if (color.colorCode == colorCode) {
                return color;
            }
        }
        return null;
    }


    public static boolean isValidColor(char colorCode) {
        for (Color color : values()) {
            if (color.colorCode == colorCode) {
                return true;
            }
        }
        return false;
    }

    public char getColorCode() {
        return colorCode;
    }

}
