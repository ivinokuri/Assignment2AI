package datatypes;

import java.util.Objects;

public class Vertex {
    private Integer id;
    private Integer numberOfPeople;
    private String comment;

    public Vertex() {
    }

    public Vertex(Integer id, Integer numberOfPeople) {
        this.id = id;
        this.numberOfPeople = numberOfPeople;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Vertex {\n" +
                "\tid = " + id +
                ", \n\tnumberOfPeople = " + numberOfPeople +
                ", \n\tcomment = '" + comment + '\'' +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return id == vertex.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
