////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2018 - A Bit of Help, Inc. - All Rights Reserved, Worldwide.
// Use of this source code is governed by a MIT license that can be found in the LICENSE file.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.abitofhelp.motominder.azuredocuments

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AzureDocumentApplication

fun main(args: Array<String>) {
    runApplication<AzureDocumentApplication>(*args)
}
