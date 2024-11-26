package com.nt.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
@Data
@Entity
@Table(name="emp")
public class Employee implements Serializable {
@Id
@SequenceGenerator(name = "gen1",sequenceName = "emp_id_seq",initialValue = 1,allocationSize = 1)
@GeneratedValue(generator = "gen1",strategy=GenerationType.SEQUENCE)
    private Integer empno;
    @Column(length = 20)
    private String ename;

    @Column(length = 20)
    private String job;


    private float sal;

    private Integer deptno;


}