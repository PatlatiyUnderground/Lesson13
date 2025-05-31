package computer.keyboard;

public enum LCD {

    LCD("computer.keyboard.LCD"),
    NOLCD("NOLCD"),;

    private String value;
    LCD(String value){
        this.value = value;
    };

    public String getValue() {
        return value;
    }
}
