package com.core.digerlaboratory.lab4_companion_object_vs_object

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab4")
class Lab4Controller(
    private val lab4UseCompanionObjectMethodService: Lab4UseCompanionObjectMethodService,
    private val lab4UseObjectMethodService: Lab4UseObjectMethodService,
) {

    @GetMapping("/companionObject")
    fun lab4CompanionObject(): String {
        lab4UseCompanionObjectMethodService.useCompanionObjectMethod()
        return ""
    }

    @GetMapping("/object")
    fun lab4Object(): String {
        lab4UseObjectMethodService.useObjectMethod()
        return ""
    }

}