package com.example.Okter;
import com.google.cloud.Timestamp;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CRUD {

/**
    private String id;
    private String name;
    private String email;
    private String username;
    private float goal;
    private DateTime lastWorkout;
    private DateTime endDate;
 **/

private String document_id;
private String name;
private String email;
private String username;
private Timestamp lastWorkout;
private Timestamp endDate;


}
