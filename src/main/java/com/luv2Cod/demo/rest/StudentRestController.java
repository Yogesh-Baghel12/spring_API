
package com.luv2Cod.demo.rest;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
        //This data every time load when we cll it this is not a good that we use the @PostConstruct Annoatation which Load tha data once
        //public List<PojoStudent> theStudents=new ArrayList<>(); 
        //theStudents.add(new PojoStudent("Pooran","Patel"));
        //theStudents.add(new PojoStudent("Prerak","singh"));
        //theStudents.add(new PojoStudent("Palak","Singh"));
        return theStudents;
        
    } 
    @GetMapping("/students/{studentId}")
    public PojoStudent getStudents(@PathVariable int studentId){

        //Error handle
        if((studentId>=theStudents.size())|| (studentId<0)){
            throw new StudentNotFoundException("student Id not found"+studentId);
        }
        return theStudents.get(studentId);
    }


    // Add an Exception handle using @ExceptionHandler 
    //THIS ERROR FOR PARTICULAR ERROR
    //@ExceptionHandler
    //public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
       // StudentErrorResponse error=new StudentErrorResponse();
       // error.setStatus(HttpStatus.NOT_FOUND.value());
       // error.setMessage(exc.getMessage());
       // error.setTimeStamp(System.currentTimeMillis());
       // return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

   // }
   
}
