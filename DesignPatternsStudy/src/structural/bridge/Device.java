package structural.bridge;

public interface Device {
    void isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int vol);
    int getChannel();
    void setChannel(int channel);
}
