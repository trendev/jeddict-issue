package fr.trendev.jeddict.issue.resources.domain;

/**
 * @author jsie
 */
@Entity
public class Entity_1 {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String name;

    @ElementCollection
    private List<String> comments;

    public Entity_1(String name) {
        this.name = name;
    }

    public Entity_1() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Entity_1 id(Long id) {

        this.id = id;
        return this;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entity_1 name(String name) {

        this.name = name;
        return this;
    }

    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public Entity_1 comments(List<String> comments) {

        this.comments = comments;
        return this;
    }

    public void addComment(String comment) {
        getComments().add(comment);
    }

    public void removeComment(String comment) {
        getComments().remove(comment);
    }

}