package in.gunjank.jobtracker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applications")
public class JobApplicationController {
    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService){
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping()
    public JobApplication createJobApplication(@RequestBody JobApplication jobApplication){
        return jobApplicationService.createJobApplication(jobApplication);
    }
}
