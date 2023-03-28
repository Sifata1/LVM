import java.util.UUID;

public class PhysicalVolume extends HardDrive {
    private String pvName;
    private UUID pvUUID;

    public PhysicalVolume(String name, int size, String pvName) {
        super(name, size);
        this.pvName = pvName;
        this.pvUUID = UUID.randomUUID();
    }

    public String getPVName() {
        return this.pvName;
    }

    public UUID getPVUUID() {
        return this.pvUUID;
    }
}
