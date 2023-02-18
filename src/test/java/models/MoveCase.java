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
public class MoveCase {

    @Expose
    @SerializedName(value = "case_ids")
    private int caseId;

    @Expose
    @SerializedName(value = "suite_id")
    public int suiteId;
}
