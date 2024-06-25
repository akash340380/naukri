package com.application.naukri.controller;

import com.application.naukri.model.Job;
import com.application.naukri.service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job")
public class JobController
{
    @Autowired
    JobServiceImpl jobServiceImpl;

    @PostMapping("/save")
    ResponseEntity<Job> saveJob(@RequestBody Job job)
    {
        return new ResponseEntity<Job>(jobServiceImpl.saveJob(job), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    ResponseEntity<List<Job>> getAllJobs()
    {
        return new ResponseEntity<>(jobServiceImpl.findAll(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Job> updateJobById(@PathVariable Long id, @RequestBody Job job)
    {
        return new ResponseEntity<Job>(jobServiceImpl.updateJobById(id, job), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteJobById(@PathVariable Long id)
    {
        return new ResponseEntity<>(jobServiceImpl.deleteById(id), HttpStatus.OK);
    }
}
