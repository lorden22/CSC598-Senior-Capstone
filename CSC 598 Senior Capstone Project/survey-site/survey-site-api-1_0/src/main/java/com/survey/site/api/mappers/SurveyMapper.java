package com.survey.site.api.mappers;

import com.survey.site.api.dto.Survey;
import com.survey.site.api.dto.create.survey.DbSurvey;
import com.survey.site.api.dto.Question;
import com.survey.site.api.dto.Response;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SurveyMapper {
    List<Question> getQuestionsByTemplate(String template);

    List<Response> getResponsesForSurvey(Long surveyId);

    Long createSurvey(DbSurvey dbSurvey);

    Long getSurveyIdFromSurveyName(String name);

    List<String> getSurveyNames();

    void submitResponse(String question, String template, String response, long surveyId);

    List<Survey> getSurveyDetails(String name);

}
