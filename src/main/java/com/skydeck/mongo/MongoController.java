package com.skydeck.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoController {
        
        @Autowired
        EmployeeRepository repo;
        @Autowired
        DbRepo dbRepo;
        
        @RequestMapping("/read2")
        public List<Employee> getAll(){
            return repo.findAll();
        }
        
        @RequestMapping("/save2")
        public void saveData() {
            System.out.println("Data creation started...");

            repo.save(new Employee(1934, "Rohit Sharma"));
            repo.save(new Employee(5423, "KL Rahul"));
            repo.save(new Employee(6798, "Surya Kumar Yadav"));
            repo.save(new Employee(1025, "Dinesh Karthik"));
            
            System.out.println("Data creation complete...");
        }
        
        @RequestMapping("/getdb")
        public List<Database> getAllDb(){
            return dbRepo.findAll();
        }
}
