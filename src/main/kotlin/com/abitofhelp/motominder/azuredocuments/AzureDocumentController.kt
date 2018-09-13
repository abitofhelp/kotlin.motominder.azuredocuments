////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2018 - A Bit of Help, Inc. - All Rights Reserved, Worldwide.
// Use of this source code is governed by a MIT license that can be found in the LICENSE file.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.abitofhelp.motominder.azuredocuments

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/documents")
@RestController
class AzureDocumentController @Autowired constructor(private val azureDocumentService: AzureDocumentService)
{
    @RequestMapping(method = [RequestMethod.GET])
    fun getAllDocuments(): List<DocumentDTO> {
        return azureDocumentService.getAll()
    }

    @RequestMapping(value = ["{id}"], method = [RequestMethod.GET])
    fun getDocumentById(@PathVariable("id") id: Int): DocumentDTO {
        return azureDocumentService.getById(id)
    }

//    @RequestMapping(method = [RequestMethod.POST])
//    fun createDocument(@RequestBody createRequest: DocumentDTO): DocumentDTO {
//        return azureDocumentService.save(createRequest)
//    }
}