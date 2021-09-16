/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author user
 */
public class Answers {
    private String sid;
    private String question1;
    private String option1;
    private String question2;
    private String option2;
    private String question3;
    private String option3;
    private String question4;
    private String option4;
    private String question5;
    private String option5;
    
    public Answers() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Answers( String sid, String question1,String option1,String question2,String option2,String option2b, String question3, String option3,String question4, String option4, String question5, String option5) {
        this.sid = sid;
        this.question1 = question1;
        this.option1 = option1;
        this.question2 = question2;
        this.option2 = option2;
        this.question3 = question3;
        this.option3 = option3;
        this.question4 = question4;
        this.option4 = option4;
        this.question5 = question5;
        this.option5 = option5;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the question1
     */
    public String getQuestion1() {
        return question1;
    }

    /**
     * @param question1 the question1 to set
     */
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    /**
     * @return the option1
     */
    public String getOption1() {
        return option1;
    }

    /**
     * @param option1 the option1 to set
     */
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    /**
     * @return the question2
     */
    public String getQuestion2() {
        return question2;
    }

    /**
     * @param question2 the question2 to set
     */
    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    /**
     * @return the option2
     */
    public String getOption2() {
        return option2;
    }

    /**
     * @param option2 the option2 to set
     */
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    /**
     * @return the question3
     */
    public String getQuestion3() {
        return question3;
    }

    /**
     * @param question3 the question3 to set
     */
    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    /**
     * @return the option3
     */
    public String getOption3() {
        return option3;
    }

    /**
     * @param option3 the option3 to set
     */
    public void setOption3(String option3) {
        this.option3 = option3;
    }

    /**
     * @return the question4
     */
    public String getQuestion4() {
        return question4;
    }

    /**
     * @param question4 the question4 to set
     */
    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    /**
     * @return the option4
     */
    public String getOption4() {
        return option4;
    }

    /**
     * @param option4 the option4 to set
     */
    public void setOption4(String option4) {
        this.option4 = option4;
    }

    /**
     * @return the question5
     */
    public String getQuestion5() {
        return question5;
    }

    /**
     * @param question5 the question5 to set
     */
    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    /**
     * @return the option5
     */
    public String getOption5() {
        return option5;
    }

    /**
     * @param option5 the option5 to set
     */
    public void setOption5(String option5) {
        this.option5 = option5;
    }

}
