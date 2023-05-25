public record UserBook(String brandUs, int mainMemoryUs, int hardDiscUs, String osUs, String colorUs) {

    public String toString() {
        return "Brand: " + this.brandUs + ", Main memory: " + this.mainMemoryUs + "GB, Hard disc value: " +
                this.hardDiscUs + ", Operating system: " + this.osUs + ", Color: " + this.colorUs;
    }
}
