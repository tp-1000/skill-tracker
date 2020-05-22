package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    //localhost: -- three programming languages Python,Java,JavaScript
    @GetMapping
    @ResponseBody
    public String getProgrammingLanguages(){
        String s = "<html>" +
                "    " +
                "<body>" +
                "        <h1>Skills Tracker</h1>" +
                "        <h2>Here are a few skills I've been working on<ol>" +
                "            <li>Java</li>" +
                "            <li>COBOL</li>" +
                "            <li>JavaScript</li>" +
                "        " +
                "</ol></h2>" +
                "    " +
                "</body>" +
                "</html>";
       return s;
    }

    //localhost:8080/form
    @GetMapping("/form")
    @ResponseBody
    public String rankFavoriteLanguages(){
        String s = "<html>" +
                "<body>" +
                "<form action='form' method='POST'>" +
                "<input style='display:block' type='text' name='name' placeholder='your name'>" +
                "<lable for='best_select'>Choose Your Favorite Projavascriptamming Language:</lable>" +
                "<select style='display:block' name='best_lang' id='best_select'>" +
                "<option value='java'>-- Please choose an option --</option>" +
                "<option value='cobol'>Java</option>" +
                "<option value='java'>COBOL</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select>" +
                "" +
                "" +
                "<lable for='best_select'>Choose Your Second Favorite Projavascriptamming Language:</lable>" +
                "<select style='display:block' name='better_lang' id='better_select'>" +
                "<option value='java'>-- Please choose an option --</option>" +
                "<option value='cobol'>Java</option>" +
                "<option value='java'>COBOL</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select>" +
                "" +
                "" +
                "<lable for='good-select'>Choose Your Third Favorite Projavascriptamming Language:</lable>" +
                "<select style='display:block' name='good_lang' id='good_select'>" +
                "<option value='java'>-- Please choose an option --</option>" +
                "<option value='cobol'>Java</option>" +
                "<option value='java'>COBOL</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "" +
                "<input type='submit' value='Submit faves'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return s;
    }

    @RequestMapping(value = "/form", method = {RequestMethod.POST}) //  more general set up but can take multipul
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String best_lang, @RequestParam String better_lang, @RequestParam String good_lang) {
        String s = "<html>" +
                "    <h1>"+name+"'s favorite programs</h1>" +
                "    <table>" +
                "      <tr>" +
                "          <th>1st</th>" +
                "          <th>"+best_lang+"</th>" +
                "      " +
                "</tr>" +
                "        <" +
                "tr>" +
                "          <th>2nd</th>" +
                "          <th>"+better_lang+"</th>" +
                "      </tr>  " +
                "        <tr>" +
                "          <th>3rd</th>" +
                "          <th>"+good_lang+"</th>" +
                "      </tr>  " +
                "    " +
                "</table>" +
                "</html>";

        return s;
    }

}
