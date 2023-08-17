package com.paul.registrationform.SubjectEnum;

public enum Grade {

    APLUS("A+"),
    A("A"),
    AMINUS("A-"),
    BPLUS("B+"),
    B("B"),
    BMINUS("B-");

    private final String label;

    Grade(String label) {
        this.label = label;
    }

    public String getGrade() {
        return label;
    }

    public static Grade getGradeByLabel(String label) {
        for (Grade gpaEnum : Grade.values()) {
            if (gpaEnum.label.equals(label)) {
                return gpaEnum;
            }
        }
        return null;
    }

    public static String getByLabel(Grade grade) {
        return grade.label;
    }

}

