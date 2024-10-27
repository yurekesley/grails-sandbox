package com.integritylabs

import grails.converters.JSON

class EmployeeController {

    static allowedMethods = [index: "GET",list: "GET", delete: "DELETE", save: "POST", update: "POST", getFiles: "GET"]


    static scaffold = Employee  

  
}