package project.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Player {

    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String sportsCategory;
    private Date birthDate;

}
