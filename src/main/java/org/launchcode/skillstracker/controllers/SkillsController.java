package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody

        public String skillsList(){
        return "<h1> Skill Tracker</h1>" +
                "<h2>These is some of the skills I want to learn:</h2>" +
                "<ol>" +
                "<li> C#</li>" +
                "<li> Python</li>" +
                "<li>Go</li>" +
                "<li> MD</li>" +
                "<li>Opthomology </li>" +
                "<ol>" ;
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillForm (){
        return "<form action = '/form' method = 'post'>" +
                "<label>Name</label><br />" +
                "<input type = 'text' name ='name'><br />" +
                "<label>First Favorite</label><br />" +
                "<select name = 'skill0'>" +
                "<option value = 'MD'>MD</option>" +
                "<option value = 'C#'>C#</option>" +
                "<option value = 'Go'>Go</option>" +
                "<option value = 'Ophthalmology'>Ophthalmology</option>" +
                "</select><br />" +
                "<label>Second Favorite</label><br />" +
                "<select name = 'skill1'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Cyber-Security'>Go</option>" +
                "<option value = 'Mongo-DB'>Mongo-DB</option>" +
                "</select><br />" +
                "<label>Third Favorite</label><br />" +
                "<select name = 'skill2'>" +
                "<option value = 'Actor'>Actor</option>" +
                "<option value = 'C++'>C++</option>" +
                "<option value = 'Data Management'>Data Management</option>" +
                "<option value = 'Dentist'>Dentist</option>" +
                "<input type = 'Submit' value = 'Submit'>" +
                "</form>";

    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String skill0, @RequestParam String skill1, @RequestParam String skill2){
        return "<h1>" + name + "</h1><br>" +
                "<ol>" +
                "<li>" + skill0 + "</li>" +
                "<li>" + skill1 + "</li>" +
                "<li>" + skill2 + "</li>" +
                "</ol>";

    }


}
