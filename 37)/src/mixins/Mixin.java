package mixins;

public class Mixin extends BasicImp
        implements TimeStamped, SerialNumbered, IColored {
    private TimeStamped timeStamp = new TimeStampedImp();
    private IColored colored = new Colored();
    private SerialNumbered serialNumber = new SerialNumberedImp();
    public long getStamp() { return timeStamp.getStamp(); }
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
    @Override
    public void setColor(String color) {
        colored.setColor(color);
    }
    @Override
    public String getColor() {
        return colored.getColor();
    }
}
