package com.paul.registrationform.SubjectEnum;

public enum Subject {

        BANGLA("Bangla"),
        ENGLISH("ENGLISH"),
        MATH("MATH"),
        RELIGION("RELIGION"),
        ICT("ICT"),
        PHYSICS("PHYSICS"),
        CHEMISTRY("CHEMISTRY"),
        BIOLOGY("BIOLOGY"),
        HIGHER_MATH("HIGHER MATH"),
        ACCOUNTING("ACCOUNTING"),
        FINANCE("FINANCE"),
        BUSINESS_ENTREPRENEURSHIP("BUSINESS ENTREPRENEURSHIP"),
        AGRICULTURAL_STUDIES("AGRICULTURAL STUDIES"),
        GENERAL_SCIENCE("GENERAL SCIENCE"),
        BANGLADESH_AND_GLOBAL_STUDIES("BANGLADESH AND GLOBAL STUDIES");

        private final String label;

        Subject(String label) {
                this.label = label;
        }
        public static String getBySubjectByLabel(Subject subject) {
                return subject.label;
        }

        ///
        public static Subject getByLabel(String label) {
                for (Subject subject : Subject.values()) {
                        if (subject.label.equalsIgnoreCase(label)) {
                                return subject;
                        }
                }
                throw new IllegalArgumentException("Invalid subject label: " + label);
        }


}
