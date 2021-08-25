package com.example.kotlinexample.repository

import com.example.kotlinexample.model.Document
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DocumentRepository: MongoRepository<Document, Long> {
}