package ac.ke.egerton.egerton.Service;

import ac.ke.egerton.egerton.model.Evaluate;
import ac.ke.egerton.egerton.repositories.EvaluateRepository;

public class EvaluateService {
    private EvaluateRepository evaluateRepo;

    public void addEvaluation(Evaluate evaluate){
        //save staff
        evaluateRepo.save(evaluate);
    }
}
