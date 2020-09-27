package nl9.week2.controller;

import nl9.week2.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @Autowired
    private StringService stringService;

    @PostMapping("/reversestring")
    public String reverseString(@RequestBody String name) {
       return stringService.reverseString(name);
    }

    @PostMapping("/countwords")
    public int countWords(@RequestBody String name) {
        return stringService.countWords(name);
    }

    @PostMapping("/encapsulatedstring")
    public String encapulsatedString(@RequestBody String name){
        return stringService.encapsulatedString(name);
    }


}
