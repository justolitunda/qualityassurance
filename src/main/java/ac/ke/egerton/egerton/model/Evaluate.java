package ac.ke.egerton.egerton.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Evaluate")
public class Evaluate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @NotEmpty
//    private long progId;

    @Column(name="course_clarity")
    private int courseClarity;

    @Column(name="presentation")
    private int presentation;

    @Column(name="illustrations")
    private int illustrations;

    @Column(name="student_participation")
    private int studentParticipation;

    @Column(name="ict_integration")
    private int ictIntegration;

    @Column(name="motivate_student")
    private int motivateStudent;

    @Column(name="timely_coverage")
    private int timelyCoverageOfOutline;

    @Column(name="mastery_subject")
    private int masteryOfSubjectMatter;

    @Column(name="relevant_assign")
    private int relevantAssignments;

    @Column(name="promp_assignment_feedback")
    private int promptAssignmentandFeedback;

    @Column(name="")
    private int relevantCats;

    @Column(name="cat_feed_back")
    private int catFeedBack;

    @Column(name="punctuality_class")
    private int punctualityToClass;
    @Column(name="class_attendance")
    private int attendance;

    @Column(name="available_consultation")
    private int availableForConsultations;

    @Column(name="enhance_prob_solv")
    private int enhancesProblemSolving;

    @Column(name="encourage_teamwork")
    private int encouragesTeamWork;

    @Column(name="craetivity")
    private int creativity;

    @Column(name="total_score")
    private int totalScore;

    @Column(name="average")
    private int average;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCourseClarity() {
        return courseClarity;
    }

    public void setCourseClarity(int courseClarity) {
        this.courseClarity = courseClarity;
    }

    public int getPresentation() {
        return presentation;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }

    public int getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(int illustrations) {
        this.illustrations = illustrations;
    }

    public int getStudentParticipation() {
        return studentParticipation;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setStudentParticipation(int studentParticipation) {
        this.studentParticipation = studentParticipation;
    }

    public int getIctIntegration() {
        return ictIntegration;
    }

    public void setIctIntegration(int ictIntegration) {
        this.ictIntegration = ictIntegration;
    }

    public int getMotivateStudent() {
        return motivateStudent;
    }

    public void setMotivateStudent(int motivateStudent) {
        this.motivateStudent = motivateStudent;
    }

    public int getTimelyCoverageOfOutline() {
        return timelyCoverageOfOutline;
    }

    public void setTimelyCoverageOfOutline(int timelyCoverageOfOutline) {
        this.timelyCoverageOfOutline = timelyCoverageOfOutline;
    }

    public int getMasteryOfSubjectMatter() {
        return masteryOfSubjectMatter;
    }

    public void setMasteryOfSubjectMatter(int masteryOfSubjectMatter) {
        this.masteryOfSubjectMatter = masteryOfSubjectMatter;
    }

    public int getRelevantAssignments() {
        return relevantAssignments;
    }

    public void setRelevantAssignments(int relevantAssignments) {
        this.relevantAssignments = relevantAssignments;
    }

    public int getPromptAssignmentandFeedback() {
        return promptAssignmentandFeedback;
    }

    public void setPromptAssignmentandFeedback(int promptAssignmentandFeedback) {
        this.promptAssignmentandFeedback = promptAssignmentandFeedback;
    }

    public int getRelevantCats() {
        return relevantCats;
    }

    public void setRelevantCats(int relevantCats) {
        this.relevantCats = relevantCats;
    }

    public int getCatFeedBack() {
        return catFeedBack;
    }

    public void setCatFeedBack(int catFeedBack) {
        this.catFeedBack = catFeedBack;
    }

    public int getPunctualityToClass() {
        return punctualityToClass;
    }

    public void setPunctualityToClass(int punctualityToClass) {
        this.punctualityToClass = punctualityToClass;
    }

    public int getAvailableForConsultations() {
        return availableForConsultations;
    }

    public void setAvailableForConsultations(int availableForConsultations) {
        this.availableForConsultations = availableForConsultations;
    }

    public int getEnhancesProblemSolving() {
        return enhancesProblemSolving;
    }

    public void setEnhancesProblemSolving(int enhancesProblemSolving) {
        this.enhancesProblemSolving = enhancesProblemSolving;
    }

    public int getEncouragesTeamWork() {
        return encouragesTeamWork;
    }

    public void setEncouragesTeamWork(int encouragesTeamWork) {
        this.encouragesTeamWork = encouragesTeamWork;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
