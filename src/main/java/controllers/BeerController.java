package controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class BeerController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/type/ipa")
    @ResponseBody
    String getIpaRecommendations() {
        return "Excellent choice! IPAs are so 2018. I would recommend the Brewdog IPA, Brouwerij 't IJ IPA, or the Brand IPA for today.";
    }

    @RequestMapping("/type/blond")
    @ResponseBody
    String getBlondRecommendations() {
        return "Ah we're going to get crazy tonight eh? Let's start you off with a classic Leffe Blond, a Cornet, and a Neude Gold for the real Utrechter!";
    }

    @RequestMapping("/type/double")
    @ResponseBody
    String getDoubleRecommendations() {
        return "At this time of year?! Ugh. My recommendation is for you to check something out that's more refreshing, like an IPA.";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BeerController.class, args);
    }
}