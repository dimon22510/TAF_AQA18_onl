package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Milestone {
    @EqualsAndHashCode.Exclude
    private int id;

    @Expose
    private String name;

    @Expose
    private String description;

    @Expose
    @SerializedName(value = "due_on")
    private int dueOn;

    @Expose
    @SerializedName(value = "refs")
    private String references;

    @Expose
    @SerializedName(value = "start_on")
    private int startOn;

    @Expose
    @SerializedName(value = "is_completed")
    private boolean completed;
}
