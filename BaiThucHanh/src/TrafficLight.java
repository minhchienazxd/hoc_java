public class TrafficLight {
    private String color;
    private float time;
    public TrafficLight(String initialColor, float initialTime){
        color = initialColor;
        time = initialTime;
        
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String getColor(){
        return color;
    }
    public void setTinme(float newTime){
        time = newTime;
    }
    public float getTime(){
        return time;
    }
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);
        System.out.println("Initial color: " + light.getColor());
        System.out.println("Initial duration: " + light.getTime());

        light.setColor("green");
        System.out.println("New color: " + light.getColor());

        System.out.println("Is it red? " + light.isRed());
        System.out.println("Is it green? " + light.isGreen());
    }




}
