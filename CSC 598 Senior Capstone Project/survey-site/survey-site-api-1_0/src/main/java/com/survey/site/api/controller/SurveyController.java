package com.survey.site.api.controller;

import com.survey.site.api.dto.*;
import com.survey.site.api.dto.create.survey.CreateSurveyResponse;
import com.survey.site.api.dto.create.survey.DbSurvey;
import com.survey.site.api.service.SurveyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin //Allows UI to consume these endpoints
public class SurveyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SurveyController.class);
    @Autowired
    private SurveyService surveyService;

    @GetMapping("/getQuestionsByTemplate") //Todo? get from survey id instead?
    public List<Question> getQuestions(@RequestParam("templateName") String templateName){
        LOGGER.info("Get questions for template {}", templateName);
        return surveyService.getQuestionsByTemplate(templateName);
    }

    @PostMapping(value = "/createSurvey")
    public CreateSurveyResponse createSurvey(@RequestBody DbSurvey dbSurvey) {
        LOGGER.info("Creating survey with request: {}", dbSurvey);
        CreateSurveyResponse response = surveyService.createSurvey(dbSurvey);
        LOGGER.info("Created survey: {}", response);
        return response;
    }

    @GetMapping("/getALlSurveyNames")
    public List<String> getALlSurveyNames() {
        LOGGER.info("Retrieving all survey names");
        return surveyService.getSurveyNames();
    }

    @PostMapping("/submitAnswers")
    public void submitAnswers(@RequestBody SubmitAnswersRequest request) {
        LOGGER.info("Submitting answers with request: {}", request);
        surveyService.submitAnswers(request);
    }

    @GetMapping("/getSurveyDetails")
    public List<Survey> getSurveyDetails(@RequestParam("name") String name) {
        return surveyService.getSurveyDetails(name);
    }

}
