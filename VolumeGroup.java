import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class VolumeGroup {
    private String vgName;
    private UUID vgUUID;
    private List<PhysicalVolume> pvList;
    private List<LogicalVolume> lvList;

    public VolumeGroup(String vgName, List<PhysicalVolume> pvList) {
        this.vgName = vgName;
        this.vgUUID = UUID.randomUUID();
        this.pvList = pvList;
        this.lvList = new ArrayList<>();
    }

    public String getVGName() {
        return this.vgName;
    }

    public UUID getVGUUID() {
        return this.vgUUID;
    }

    public List<PhysicalVolume> getPvList() {
        return this.pvList;
    }

    public List<LogicalVolume> getLvList() {
        return this.lvList;
    }

    public int getTotalSize() {
        int totalSize = 0;
        for (PhysicalVolume pv : pvList) {
            totalSize += pv.getSize();
        }
        return totalSize;
    }

    public int getFreeSpace() {
        int totalFreeSpace = getTotalSize();
        for (LogicalVolume lv : lvList) {
            totalFreeSpace -= lv.getSize();
        }
        return totalFreeSpace;
    }

    public void addPhysicalVolume(PhysicalVolume pv) {
        pvList.add(pv);
    }

    public void addLogicalVolume(LogicalVolume lv) {
        lvList.add(lv);
    }
}
