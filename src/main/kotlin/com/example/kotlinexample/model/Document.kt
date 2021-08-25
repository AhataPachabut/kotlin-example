package com.example.kotlinexample.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Document(
    @Id var id:Long,
    val documentName:String,
    val documentType: String,
    val creatorId: String)