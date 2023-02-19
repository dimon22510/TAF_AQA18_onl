package models;

import com.google.gson.annotations.Expose;
import lombok.*;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Section {
    @Expose
    private String name;

    @Expose
    private String description;

    @Expose
    private int suite_id;
}
