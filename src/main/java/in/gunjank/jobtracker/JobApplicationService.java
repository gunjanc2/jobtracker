package in.gunjank.jobtracker;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository, LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean){
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication createJobApplication(JobApplication jobApplication){
        LocalDateTime  now = LocalDateTime.now();
        jobApplication.setCreatedDate(now);
        jobApplication.setUpdatedDate(now);
        return jobApplicationRepository.save(jobApplication);
    }
}
