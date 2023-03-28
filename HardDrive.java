import java.util.*;

public class HardDrive {
    private String name;
    private int size;
    private UUID uuid;

    public HardDrive(String name, int size) {
        this.name = name;
        this.size = size;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public UUID getUUID() {
        return this.uuid;
    }
}