public enum ScreenType {

    LCD("LCD"),
    OLED("OLED"),;

    private String value;
    ScreenType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
