package Alfa;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * implements comparator when we want to use TreeSet<> -
 * implementation of the Set Collection
 */
public class Employer {
    private int id;
    private String name;
    private Group groupId;

    public Employer(int id, String name, Group groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return id == employer.id &&
                Objects.equals(name, employer.name) &&
                Objects.equals(groupId, employer.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, groupId);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupId=" + groupId +
                '}';
    }


/**    @Override
 *   public int compareTo(@NotNull Employer employer) {
 *       return this.id - employer.id;
 */
}
