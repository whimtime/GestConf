package com.gestioneconferenzews.DAO.model;

public class Budget {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column budget.cd_budget
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    private Integer cdBudget;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column budget.cd_conferenza
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    private Integer cdConferenza;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column budget.totale
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    private Integer totale;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column budget.cd_budget
     *
     * @return the value of budget.cd_budget
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public Integer getCdBudget() {
        return cdBudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column budget.cd_budget
     *
     * @param cdBudget the value for budget.cd_budget
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void setCdBudget(Integer cdBudget) {
        this.cdBudget = cdBudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column budget.cd_conferenza
     *
     * @return the value of budget.cd_conferenza
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public Integer getCdConferenza() {
        return cdConferenza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column budget.cd_conferenza
     *
     * @param cdConferenza the value for budget.cd_conferenza
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void setCdConferenza(Integer cdConferenza) {
        this.cdConferenza = cdConferenza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column budget.totale
     *
     * @return the value of budget.totale
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public Integer getTotale() {
        return totale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column budget.totale
     *
     * @param totale the value for budget.totale
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void setTotale(Integer totale) {
        this.totale = totale;
    }
}