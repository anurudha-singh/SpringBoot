package entities;

import jakarta.persistence.Id;

public class Course {
    @Id
    private long ID;
    private String title;
    private String description;

    public Course(long ID, String title, String description) {
        this.ID = ID;
        this.title = title;
        this.description = description;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Course{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
