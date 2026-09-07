package com.test.ylee.KotlinSpringPractice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import com.test.ylee.KotlinSpringPractice.TestResponse
import com.test.ylee.KotlinSpringPractice.TestService



@RestController
@RequestMapping("/")
class TestController(
    private val testService : TestService
) {

    @GetMapping("/hello")
    fun hello(): String {
        return testService.getHello()
    }

    @GetMapping("/lists")
    fun getList(): List<TestResponse> {
        return testService.getTestList()
    }

    @GetMapping("/giveme")
    fun giveme(): String {
        return "GIVE ME THE MONEY"
    }
}