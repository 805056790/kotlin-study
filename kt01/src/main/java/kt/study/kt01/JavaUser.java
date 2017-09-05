package kt.study.kt01;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * @author : panxin
 */
public class JavaUser implements Serializable {

    private static final long serialVersionUID = 3508166976325641749L;

    private Integer id;

    private String name;

    public JavaUser() {}

    public JavaUser(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public JavaUser(@NotNull String name) {
        this.id = 1;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
