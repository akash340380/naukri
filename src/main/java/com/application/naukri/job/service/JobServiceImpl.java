package com.application.naukri.job.service;

import com.application.naukri.job.model.Job;
import com.application.naukri.job.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    JobRepository jobRepository;

    @Override
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id);
    }

    @Override
    public Job updateJobById(Long id, Job job) {
        if(jobRepository.findById(id)!=null)
        {
            return jobRepository.save(job);
        }
        return null;
    }

    @Override
    public String deleteById(Long id) {
        jobRepository.deleteById(id);
        return "Deleted Successfully!!";
    }
}
