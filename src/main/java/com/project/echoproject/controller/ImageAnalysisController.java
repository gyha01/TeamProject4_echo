package com.project.echoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageAnalysisController {

    @GetMapping("/analysis")
    public String index() {
        return "imageAnalysis";
    }
}
