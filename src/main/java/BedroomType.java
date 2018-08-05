public enum bedroomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    SUITE(6);

    private final int capacity;

    bedroomType(int capacity) {
        this.capacity = capacity;
    }
}

