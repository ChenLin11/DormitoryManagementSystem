package com.cl.utils.algorithm;

import java.util.Arrays;

public class Classfier {
    private String studentId;
    private int[] fenglei;

    public Classfier(String studentId, int[] fenglei) {
        this.studentId = studentId;
        this.fenglei = fenglei;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int[] getFenglei() {
        return fenglei;
    }

    public void setFenglei(int[] fenglei) {
        this.fenglei = fenglei;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classfier classfier = (Classfier) o;

        if (studentId != null ? !studentId.equals(classfier.studentId) : classfier.studentId != null) return false;
        return Arrays.equals(fenglei, classfier.fenglei);
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(fenglei);
        return result;
    }
}
