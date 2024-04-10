public class Gadget {
    private String modelName;
    private int powerUse;
    private boolean isWireless;
    private String function;
    private boolean isOn;

    public Gadget(String modelName, int powerUse, boolean isWireless, String function, boolean isOn) {
        this.modelName = modelName;
        this.powerUse = powerUse;
        this.isWireless = isWireless;
        this.function = function;
        this.isOn = isOn;
    }

    public void setName(String newModelName) {
        this.modelName = newModelName;
    }

    public String getName() {
        return modelName;
    }

    public void setPowerUse(int newPowerUse) {
        this.powerUse = newPowerUse;
    }

    public int getPowerUse() {
        return powerUse;
    }

    public void setWireless(boolean wireless) {
        this.isWireless = wireless;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setFunction(String newFunction) {
        this.function = newFunction;
    }
    
    public String getFunction() {
        return function;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void printInfo() {
        System.out.println("This Gadget: " + getName());
        System.out.println("Power use: " + getPowerUse());
        System.out.println("Is wireless: " + isWireless());
        System.out.println("Gadgets function: " + getFunction());
        System.out.println("Is on: " + isOn());
        System.out.println(" ");
    }

    public void activateGadget() {
        if(isOn()) {
            System.out.println(getName() + " is already activated.");
        } else {
            this.isOn = true;
            System.out.println("You activated " + getName());
            System.out.println("These are the stats now:");
            printInfo();
        }

        System.out.println("");
    }


    public static void main(String[] args) {
        Gadget sparkplug = new Gadget("Sparkplug", 10, false, "sparks", true);
        Gadget alterantor = new Gadget("Alternator", 25, false, "charges the battery while driving", false);

        sparkplug.activateGadget();
        alterantor.activateGadget();
    }



}
