package com.endlessmilkyway.common;

import java.util.Objects;

public class StudentDTO {

    private final long id;
    private final String name;
    private final String dept;
    private final String phoneNumber;

    public StudentDTO(long id, String name, String dept, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.phoneNumber = phoneNumber;
    }

    public boolean compareId(long stu_id) {
        return stu_id == this.id;
    }

    public boolean compareName(String name) {
        return Objects.equals(name, this.name);
    }

    @Override
    public String toString() {
        return "[" +
                "학번 : " + id +
                " 성명 : " + name +
                " 학과 : " + dept +
                " 연락처 : " + phoneNumber +
                "]";
    }
}
