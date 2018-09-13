////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2018 - A Bit of Help, Inc. - All Rights Reserved, Worldwide.
// Use of this source code is governed by a MIT license that can be found in the LICENSE file.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.abitofhelp.motominder.azuredocuments

import org.springframework.stereotype.Service

@Service
class AzureDocumentService {
    val docs = listOf(
        DocumentDTO(0, "Who's who with whom?", 123),
        DocumentDTO(0, "I have a dream to fly", 321))

    fun getAll() = docs

    fun getById(id : Int) : DocumentDTO {
        return when {
            id < 0 -> {
                DocumentDTO(0, "", 0)
            }
            id <= docs.size -> docs[id]
            else -> {
                DocumentDTO(0, "", 0)
            }
        }
    }
}



