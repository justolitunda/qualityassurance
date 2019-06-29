package ac.ke.egerton.egerton.controllers;

import ac.ke.egerton.egerton.model.Evaluate;
import ac.ke.egerton.egerton.repositories.EvaluateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class EvaluteController {
    private EvaluateRepository evaluateRepo;

    @PostMapping
    public void handleUpload(@ModelAttribute Evaluate evaluate,  @RequestParam Map<String, String> requestParams){
        int group1=Integer.parseInt(requestParams.get("group1"));
        int group2 = Integer.parseInt(requestParams.get("group2"));
        int group3=Integer.parseInt(requestParams.get("group3"));
        int group4 = Integer.parseInt(requestParams.get("group4"));
        int group5=Integer.parseInt(requestParams.get("group5"));
        int group6 = Integer.parseInt(requestParams.get("group6"));
        int group7=Integer.parseInt(requestParams.get("group7"));
        int group8 = Integer.parseInt(requestParams.get("group8"));
        int group9=Integer.parseInt(requestParams.get("group1"));
        int group10 = Integer.parseInt(requestParams.get("group2"));
        int group11=Integer.parseInt(requestParams.get("group11"));
        int group12 = Integer.parseInt(requestParams.get("group12"));
        int group13=Integer.parseInt(requestParams.get("group13"));
        int group14 = Integer.parseInt(requestParams.get("group14"));
        int group15=Integer.parseInt(requestParams.get("group15"));
        int group16= Integer.parseInt(requestParams.get("group16"));
        int group17=Integer.parseInt(requestParams.get("group17"));
        int group18= Integer.parseInt(requestParams.get("group18"));





        evaluate.setCourseClarity(group1);
        evaluate.setPresentation(group2);
        evaluate.setIllustrations(group3);
        evaluate.setStudentParticipation(group4);
        evaluate.setIctIntegration(group5);
        evaluate.setMotivateStudent(group6);
        evaluate.setTimelyCoverageOfOutline(group7);
        evaluate.setMasteryOfSubjectMatter(group8);
        evaluate.setRelevantAssignments(group9);
        evaluate.setPromptAssignmentandFeedback(group10);
        evaluate.setRelevantCats(group11);
        evaluate.setCatFeedBack(group12);
        evaluate.setAttendance(group13);
        evaluate.setPunctualityToClass(group14);
        evaluate.setAvailableForConsultations(group15);
        evaluate.setEnhancesProblemSolving(group16);
        evaluate.setEncouragesTeamWork(group17);
        evaluate.setCreativity(group18);


        evaluateRepo.save(evaluate);
        int total = group1 + group2+group3+group4+group5+group6+group7+group8+group9+group10+group11+group12+group13+group14+group15+group16+group17+group18;
        int average = total/18;

        evaluate.setTotalScore(total);
        evaluate.setAverage(average);


        evaluateRepo.save(evaluate);
    }
}
