package com.banking

class Customer {

String name
String address
int accounts
String loan
String mortgage

    static constraints = {

name blank:false, null:false, maxSize:50
address blank:false, null:false, maxSize:50
accounts blank:false, null:false, min:1, max:2
loan blank:true, null:true, maximum:1000000
mortgage blank:true, null:true
    }
}
