package com.survey.site.api.dto.create.survey;

public class CreateSurveyResponse {
    private Long surveyId;

    public CreateSurveyResponse(){}

    public CreateSurveyResponse id(Long id) {
        this.surveyId = id;
        return this;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    @Override
    public String toString() {
        return "CreateSurveyResponse{" +
                "surveyId=" + surveyId +
                '}';
    }
}