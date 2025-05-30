public enum DeliverTypes {
    AUTO("На авто 100р"),
    SHIP("Кораблем 500р"),
    AVIA("Самолетом 1000р");
    private String value;
    DeliverTypes(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
