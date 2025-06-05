package main;

public class Teleporter extends Item {
    private String targetLocationName;

    public Teleporter(String name, String description, String targetLocationName) {
        super(name, description);
        this.targetLocationName = targetLocationName;
    }

    public String getTargetLocationName() {
        return targetLocationName;
    }

    @Override
    public String inspect() {
        return "Ce téléporteur peut vous transporter où vous voulez. " ;
    }
}
