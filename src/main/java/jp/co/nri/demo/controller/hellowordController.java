package jp.co.nri.demo.controller;

import jp.co.nri.demo.model.PeopleModel;
import jp.co.nri.demo.service.impl.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hellowordController {
    @Autowired
    PeopleServiceImpl peopleServicelmpl;
    @GetMapping("/hello")
    String hello(){
        return "helloworld";
    }
    @GetMapping("/people")
    List<PeopleModel> selectPeople(){
        return peopleServicelmpl.selectPeoples();
    }
    @GetMapping("/young")
    PeopleModel selectPeopleById(int id){
        return peopleServicelmpl.selectPeopleById(id);
    }
}
