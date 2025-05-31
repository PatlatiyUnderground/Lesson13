package computer.hd;

public enum HDType {

    SSD("computer.hd.HD SSD"),
    HDD("computer.hd.HD HDD"),;

    private String value;
    HDType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
