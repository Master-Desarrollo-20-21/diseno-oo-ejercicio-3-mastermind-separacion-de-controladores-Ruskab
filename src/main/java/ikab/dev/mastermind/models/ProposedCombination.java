package ikab.dev.mastermind.models;

public class ProposedCombination extends Combination {

    public ProposedCombination(char[] colors) {
        for (char colorCode : colors) {
            this.getColors().add(Color.of(colorCode));
        }
    }

    public String getColorsCode() {
        StringBuilder colorCodes = new StringBuilder();
        for (Color color : super.getColors()) {
            colorCodes.append(color.getColorCode());
        }
        return colorCodes.toString();
    }

    public boolean hasColor(Color color, int position) {
        return colors.get(position).equals(color);
    }

    public boolean hasColor(Color color) {
        return colors.contains(color);
    }

}