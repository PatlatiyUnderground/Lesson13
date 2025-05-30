public enum HDType {

    SSD("HD SSD"),
    HDD("HD HDD"),;

    private String value;
    HDType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
