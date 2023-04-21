package com.parameter.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(value="/parameter",produces= {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class EmployeController {

}
