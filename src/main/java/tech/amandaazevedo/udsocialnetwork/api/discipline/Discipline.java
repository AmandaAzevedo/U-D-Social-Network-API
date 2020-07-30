package tech.amandaazevedo.udsocialnetwork.api.discipline;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@EqualsAndHashCode(of={"id"})
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discipline_generator")
    @SequenceGenerator(name = "discipline_generator", sequenceName = "discipline_sequence", allocationSize = 1)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private String name;

    @NonNull
    private double note;

}
