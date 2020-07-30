package tech.amandaazevedo.udsocialnetwork.api.discipline.service;

import tech.amandaazevedo.udsocialnetwork.api.discipline.Discipline;

@FunctionalInterface
public interface GetDisciplineServiceImpl {

    public Discipline getDiscipline(Long id);
}
