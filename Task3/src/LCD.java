public enum LCD {

    LCD("LCD"),
    NOLCD("NOLCD"),;

    private String value;
    LCD(String value){
        this.value = value;
    };

    public String getValue() {
        return value;
    }
}
