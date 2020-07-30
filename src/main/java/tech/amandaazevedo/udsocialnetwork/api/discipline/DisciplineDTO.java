package tech.amandaazevedo.udsocialnetwork.api.discipline;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@RequiredArgsConstructor
@Setter
@ToString
@EqualsAndHashCode(of={"id"})
public class DisciplineDTO implements Serializable {

    private static final long serialVersionUID = 2130575470926556817L;

    private Long id;

    @NonNull
    private String name;

    @NonNull
    private double note;

}
