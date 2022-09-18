package com.example.demo.oneToOneMapping;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "instructor_details")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_detail_id")
    private int id;
    @Column(name = "you_tube_channel")
    private String youTubeChannel;
    @Column(name = "hobby")
    private String hobby;

}
