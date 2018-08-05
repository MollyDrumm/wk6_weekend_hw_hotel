public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    SUITE(6);

    private final int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public void getAllBedroomTypes(){
         BedroomType.values();
    }

}

