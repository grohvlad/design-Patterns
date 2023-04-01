public class WheelFlyweight {

    enum Material{ plastic, wooden, iron}
    enum Color{ black, brown, red, blue, silver}

    private Material material;
    private Color color;


    public WheelFlyweight(Material material, Color color) {
        this.material = material;
        this.color = color;
    }

    public String getInfo(){
        return  color.toString() + " " + material.toString() + " wheel";
    }
}
