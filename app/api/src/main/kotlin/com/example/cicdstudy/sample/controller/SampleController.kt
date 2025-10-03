package com.example.cicdstudy.sample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/sample")
class SampleController{
    @GetMapping
    fun hello(): String{
        return "Hello, Spring boot Kotlin!!!"
    }
}
