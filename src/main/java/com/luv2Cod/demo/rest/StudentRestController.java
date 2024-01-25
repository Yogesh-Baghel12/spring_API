
package com.luv2Cod.demo.rest;
import java.util.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2Cod.demo.Entity.PojoStudent;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<PojoStudent> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents=new ArrayList<>(); 
        theStudents.add(new PojoStudent("Pooran","Patel"));
        theStudents.add(new PojoStudent("Prerak","singh"));
        theStudents.add(new PojoStudent("Palak","Singh"));

    }
    @GetMapping("/students")
    public List<PojoStudent > getStudent(){
        return theStudents;
        
    } 
    @GetMapping("/students/{studentId}")
    public PojoStudent getStudents(@PathVariable int studentId){
        return theStudents.get(studentId);
    }
}
