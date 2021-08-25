package com.example.kotlinexample.service

import com.example.kotlinexample.model.Document
import com.example.kotlinexample.repository.DocumentRepository
import org.springframework.stereotype.Service

interface DocumentService {
    fun save(doc: Document): Document
    fun update(doc: Document, id: Long): Document
    fun get(): Collection<Document>
    fun get(id: Long): Document
    fun delete(id: Long)
}

@Service
class DocumentServiceImpl(private val docRepository: DocumentRepository) : DocumentService {

    override fun save(doc: Document): Document =
        docRepository.save(doc)

    override fun update(doc: Document, id: Long): Document {
        doc.id = id
        return docRepository.save(doc)
    }

    override fun get(): Collection<Document> =
        docRepository.findAll()

    override fun get(id: Long): Document =
        docRepository.findById(id).get()

    override fun delete(id: Long) = docRepository.deleteById(id)
}