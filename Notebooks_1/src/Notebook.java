
    public class Notebook {
        private final String brand;
        private final int mainMemory;
        private final int hardDisc;
        private final String os;
        private final String color;

        public Notebook(String brand, int mainMemory, int hardDisk, String os, String color) {
            this.brand = brand;
            this.mainMemory = mainMemory;
            this.hardDisc = hardDisk;
            this.os = os;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public int getMainMemory() {
            return mainMemory;
        }

        public int getHardDisc() {
            return hardDisc;
        }

        public String getOs() {
            return os;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Main memory: " + mainMemory + "GB, Hard disc value: " + hardDisc + ", Operating system: "
                    + os + ", Color: " + color;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Notebook notebook)) {
                return false;
            }
            return brand.equals(notebook.brand) && mainMemory == notebook.mainMemory &&
                    hardDisc == notebook.hardDisc && os.equals(notebook.os) && color.equals(notebook.color);
        }

        @Override
        public int hashCode() {
            return brand.hashCode() + 7 * mainMemory + 11 * hardDisc + 14 * os.hashCode() + 17 * color.hashCode();
        }
    }
