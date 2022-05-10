package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class SkillsController {
    @GetMapping
    @ResponseBody
    public String homePage(){
        return "<html> <body> " +
                "<h1> Skills Tracker </h1>" +
                "<ol> " +
                "<li> <h2> JavaScript </h2> </li> " +
                "<li> <h2> Java </h2> </li> " +
                "<li> <h2> Python </h2> </li> " +
                "</ol>" +
                "</body> </html> ";
    }

    @GetMapping("/form")
    @ResponseBody
    public String inputForm(){
        return "<html> <body> " +
                "<form method = 'post'>  " +
                "<label> Name <input type = 'text' name = 'name' /> </label> " +
                "<br>" +
                "<label> My Favorite Language: </label> " +
                    "<select name = \"firstLanguage\" id = \"firstLanguage\">" +
                    " <option value = \"Java\"> Java </option>" +
                    " <option value = \"JavaScript\"> JavaScript </option>" +
                    " <option value = \"Python\"> Python </option>" +
                    "</select>" +
                    "<br>" +
                "<label> My Second Favorite Language: </label> " +
                    "<select name = \"secondLanguage\" id = \"secondLanguage\">" +
                    " <option value = \"Java\"> Java </option>" +
                    " <option value = \"JavaScript\"> JavaScript </option>" +
                    " <option value = \"Python\"> Python </option>" +
                    "</select>" +
                    "<br>" +
                "<label> My Third Favorite Language: </label> " +
                    "<select name = \"thirdLanguage\" id = \"thirdLanguage\">" +
                    " <option value = \"Java\"> Java </option>" +
                    " <option value = \"JavaScript\"> JavaScript </option>" +
                    " <option value = \"Python\"> Python </option>" +
                    "</select>" +
                    "<br>" +
                "<input type = 'submit'>" +
                "</form>" +
                "</body> </html> ";

    }
    @PostMapping("/form")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return "<html> <body> " +
                "<h1> " + name + "</h1>" +
                "<ol> " +
                "<li> <h2> " + firstLanguage + " </h2> </li> " +
                "<li> <h2> " + secondLanguage + " </h2> </li> " +
                "<li> <h2> " + thirdLanguage + " </h2> </li> " +
                "</ol>" +
                "</body> </html> ";
    }
}
