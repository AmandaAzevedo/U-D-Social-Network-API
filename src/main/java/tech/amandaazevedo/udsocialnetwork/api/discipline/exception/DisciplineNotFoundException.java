package tech.amandaazevedo.udsocialnetwork.api.discipline.exception;

public class DisciplineNotFoundException extends RuntimeException {

    public DisciplineNotFoundException(String msg){
        super(msg);
    }
}