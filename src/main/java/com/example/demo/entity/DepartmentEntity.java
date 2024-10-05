package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@Entity
@Table(name = "department_details")
public class DepartmentEntity {

    @Id
    @Column(name = "dept_id")
    private Long deptId;

    @Column(name = "dept_name")
    private String deptName;

//    public DepartmentEntity(Long deptId, String deptName) {
//        this.deptId = deptId;
//        this.deptName = deptName;
//    }

    public DepartmentEntity() {
    }
}
