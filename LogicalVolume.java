import java.util.UUID;

public class LogicalVolume {
    private String lvName;
    private UUID lvUUID;
    private int size;
    private VolumeGroup vg;

    public LogicalVolume(String lvName, int size, VolumeGroup vg) {
        this.lvName = lvName;
        this.lvUUID = UUID.randomUUID();
        this.size = size;
        this.vg = vg;
    }

    public String getLVName() {
        return this.lvName;
    }

    public UUID getLVUUID() {
        return this.lvUUID;
    }

    public int getSize() {
        return this.size;
    }

    public VolumeGroup getVG() {
        return this.vg;
    }
}
