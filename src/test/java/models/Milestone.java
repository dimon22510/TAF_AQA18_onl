package models;

import lombok.*;
import net.bytebuddy.build.ToStringPlugin;

@Data
@NoArgsConstructor
public class Milestone {
    @EqualsAndHashCode.Exclude
    private int id;

    @NonNull
    private String name;
    private String references;
    private String description;
    @ToString.Exclude
    private boolean completed;
}
