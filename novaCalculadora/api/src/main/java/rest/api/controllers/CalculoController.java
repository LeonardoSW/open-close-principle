package rest.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.*;

@RestController
@RequestMapping(value = "/api/calculo")
public class CalculoController {
    
    @GetMapping("/sum/{firstNumber}/{secondNumber}")
    public String CalculaSoma(@PathVariable(value = "firstNumber") double firstNumber,
                              @PathVariable(value = "secondNumber") double secondNumber){
        
        SUM calc = new SUM();
        calc.firstNumber = firstNumber;
        calc.secoundNumber = secondNumber;
        
        return "Result: " + calc.Calculate();
    }

    @GetMapping("/sub/{firstNumber}/{secondNumber}")
    public String CalculaSub(@PathVariable(value = "firstNumber") double firstNumber,
                              @PathVariable(value = "secondNumber") double secondNumber){
        
        SUB calc = new SUB();
        calc.firstNumber = firstNumber;
        calc.secoundNumber = secondNumber;
        
        return "Result: " + calc.Calculate();
    }

    @GetMapping("/mult/{firstNumber}/{secondNumber}")
    public String CalculaMult(@PathVariable(value = "firstNumber") double firstNumber,
                              @PathVariable(value = "secondNumber") double secondNumber){
        
        MULT calc = new MULT();
        calc.firstNumber = firstNumber;
        calc.secoundNumber = secondNumber;
        
        return "Result: " + calc.Calculate();
    }

    @GetMapping("/div/{firstNumber}/{secondNumber}")
    public String CalculaDiv(@PathVariable(value = "firstNumber") double firstNumber,
                              @PathVariable(value = "secondNumber") double secondNumber){
        
        DIV calc = new DIV();
        calc.firstNumber = firstNumber;
        calc.secoundNumber = secondNumber;
        
        return "Result: " + calc.Calculate();
    }
}
