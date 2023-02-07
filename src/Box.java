public class Box {
    int x;

    int y;
    int z;
    Box () {

    }
    public String displayTypeOfBox() {
        if (x == y && x == z)
            return "Cube";
        else if (z == 0)
            return "Envelope";
        else
            return "Box";    }

    public static class Car {
        private Brand brand;
        private Color color;
        public Car(Brand brand, Color color) {
            this.brand = brand;
            for (Color c : brand.getColors()) {
                if (c == color) {
                    this.color = color;
                    break;
                }
            }
        }
        public void setColor(String newColor) {
            for (Color col : brand.getColors()) {
                if (col.name().equals(newColor.toUpperCase())) {
                    color = col;
                }
            }
        }
        public Brand getBrand() {
            return this.brand;
        }
        public Color getColor() {
            return this.color;
        }
        @Override

        public String toString() {
            return "Box.Car{" + "brand=" + brand + ", color=" + color +  '}';
        }    public enum Color { BLUE, RED, GREEN, ORANGE, BLACK, PURPLE, YELLOW, GRAY, WHITE;}
        public enum Brand {AUDI(new Color[]{Color.BLUE, Color.RED, Color.GREEN}),
            BMW(new Color[]{Color.ORANGE, Color.BLACK, Color.PURPLE}),
            KIA(new Color[]{Color.YELLOW, Color.BLACK, Color.WHITE});
            private final Color[] colors;
            Brand(Color[] colors) {
                this.colors = colors;
            }        public Color[] getColors() {
                return colors;
            }
        }
    }
}
