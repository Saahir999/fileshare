package com.example.firebase

class Upload
{
    private var name: String
    private var url: String
    constructor(nam:String, ur:String )
    {
        name = nam
        url = ur
    }


    fun getNam(): String
    {
        return(name)
    }

    fun getAurl():String
    {
        return(url)
    }
}