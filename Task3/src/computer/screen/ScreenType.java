package computer.screen;

public enum ScreenType {

    LCD("computer.keyboard.LCD"),
    OLED("OLED"),;

    private String value;
    ScreenType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
