package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {
    public static final String JAVA = "Java";
    public static final String JAVASCRIPT = "JavaScript";
    public static final String RUST = "Rust";

    @GetMapping(value="/")
    @ResponseBody
    public static String skillsDisplay(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>Languages</h2>" +
                "<ol>" +
                "<li>" + JAVA + "</li>" +
                "<li>" + JAVASCRIPT + "</li>" +
                "<li>" + RUST + "</li>" +
                "</ol>";
    }
    @GetMapping(value="/form")
    @ResponseBody

    public static String skillsForm(){

        return "<html>" +
                "<body>" +
                "<form action='' method='get'>" +
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                "<option value=''>--Please select an option--</value>" +
                "<option value='java'>Java</value>" +
                "<option value='js'>JavaScript</value>" +
                "<option value='py'>Python</value>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
