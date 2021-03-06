package mx.edu.utez.sda.Validation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.sda.Validation.entity.State;
import mx.edu.utez.sda.Validation.service.StateService;

@RestController
@RequestMapping(path = "/state")
public class StateController {
    
    @Autowired
    private StateService stateService;

    @GetMapping("")
    @Transactional(readOnly = true)
    public List<State> getAllState(){
        return stateService.getAll();
    }
}
