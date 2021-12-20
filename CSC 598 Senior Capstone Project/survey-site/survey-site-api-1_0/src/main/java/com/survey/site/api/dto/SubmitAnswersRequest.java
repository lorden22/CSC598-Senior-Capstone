package com.survey.site.api.dto;

import java.util.Map;

public class SubmitAnswersRequest {
    private String surveyName;
    private String templateName;
    private Map<String, String> questionAnswerMap;

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Map<String, String> getQuestionAnswerMap() {
        return questionAnswerMap;
    }

    public void setQuestionAnswerMap(Map<String, String> questionAnswerMap) {
        this.questionAnswerMap = questionAnswerMap;
    }

    @Override
    public String toString() {
        return "SubmitAnswersRequest{" +
                "surveyName='" + surveyName + '\'' +
                ", templateName='" + templateName + '\'' +
                ", questionAnswerMap=" + questionAnswerMap +
                '}';
    }
}
