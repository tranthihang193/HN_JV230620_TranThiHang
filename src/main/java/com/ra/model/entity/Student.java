package com.ra.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "phone_number")
    private String phone;
    @Column(name = "image_url")
    private String image;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "address")
    private String address;

    public Student() {
    }

    public Student(Integer id, String name, Boolean sex, String phone, String image, Date birthday, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.image = image;
        this.birthday = birthday;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}