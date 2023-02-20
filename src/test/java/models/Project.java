package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Builder
@Getter
@Setter
@Data
@EqualsAndHashCode
@ToString
public class Project {
    @Expose
    private String name;

    @Expose
    private String announcement;

    @Expose
    @SerializedName(value = "suite_mode")
    private int type;

    @Expose
    @SerializedName(value = "show_announcement")
    private boolean showAnnouncement;
//    private boolean deleted;

}
