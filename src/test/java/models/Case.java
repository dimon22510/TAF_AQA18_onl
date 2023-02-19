package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Case {
    @Expose
    private int id;

    @Expose
    private String title;

    @Expose
    @SerializedName("template_id")
    private int templateId;

    @Expose
    @SerializedName(value = "section_id")
    private int sectionId;

    @Expose
    @SerializedName("type_id")
    private int typeId;


    @Expose
    @SerializedName(value = "priority_id")
    private int priorityId;

    @Expose
    private String estimate;
}
