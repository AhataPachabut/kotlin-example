package com.example.kotlinexample.controller

import com.example.kotlinexample.model.Document
import com.example.kotlinexample.service.DocumentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
class DocumentController(private val docService: DocumentService) {

    @GetMapping("/documents")
    fun getDocuments(): ResponseEntity<Collection<Document>> =
        ResponseEntity(docService.get(), HttpStatus.OK)

    @PostMapping("/documents")
    fun createNewDocument(@Valid @RequestBody newDocument: Document): ResponseEntity<Document> =
        ResponseEntity(docService.save(newDocument), HttpStatus.OK)

    @GetMapping("/documents/{id}")
    fun getDocumentById(@PathVariable(value = "id") id: Long) =
        ResponseEntity(docService.get(id), HttpStatus.OK)

    @PutMapping("/documents/{id}")
    fun updateDocumentById(
        @PathVariable(value = "id") id: Long,
        @Valid @RequestBody newDocument: Document
    ): ResponseEntity<Document> =
        ResponseEntity(docService.update(newDocument, id), HttpStatus.OK)

    @DeleteMapping("/documents/{id}")
    fun deleteDocumentById(@PathVariable(value = "id") id: Long) =
        docService.delete(id)

}