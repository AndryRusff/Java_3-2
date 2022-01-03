package ru.netology.domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private Placeholder laceholder;
    private boolean canPublishFreeCopy;
    private String editMode; // all — всю информацию о VK Donut, duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Placeholder getLaceholder() {
        return laceholder;
    }

    public void setLaceholder(Placeholder laceholder) {
        this.laceholder = laceholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
