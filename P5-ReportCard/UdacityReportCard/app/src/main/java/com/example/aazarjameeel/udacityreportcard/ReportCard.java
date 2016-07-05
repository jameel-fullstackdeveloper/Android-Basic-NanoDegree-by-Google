package com.example.aazarjameeel.udacityreportcard;

/**
 * Created by aazarjameeel on 30-Jun-16.
 */
public class ReportCard {

    // Name of the Student
    private String mStudentName;

    // Grade of the Student
    private String mStudentGrade;

    // Year of the Student
    private int mStudentYear;

    /*
    * Create a new ReportCard object / Constrcutor
    *
    * @param vStudentName is the name of the student
    * @param vStudentGrade is the grade of the student
    * @param vStudentYear is the year of the student
    * */
    public ReportCard(String vStudentName, String vStudentGrade, int vStudentYear)
    {
        mStudentName = vStudentName;
        mStudentGrade = vStudentGrade;
        mStudentYear = vStudentYear;
    }


    /* Get the name of the student */
    public String getStudentName() {
        return mStudentName;
    }

    /* Get the grade of the student */
    public String getStudentGrade() {
        return mStudentGrade;
    }

    /* Get the year of the student */
    public int getStudentYear() {
        return mStudentYear;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentName='" + mStudentName + '\'' +
                ", mStudentGrade='" + mStudentGrade + '\'' +
                ", mStudentYear=" + mStudentYear +
                '}';
    }
}
