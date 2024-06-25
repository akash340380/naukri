package com.application.naukri.job.service;

import com.application.naukri.job.model.Job;

import java.util.List;
import java.util.Optional;

public interface JobService
{
    public Job saveJob(Job job);
    public List<Job> findAll();
    public Optional<Job> findById(Long id);
    public Job updateJobById(Long id, Job job);
    public String deleteById(Long id);
}
