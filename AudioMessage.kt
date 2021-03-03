package com.example.vois.model

import java.util.*
object AudioMessageType{
    const val CUSTOM="CUSTOM"
    const val STOCK="STOCK"
}

interface AudioMessage{
    val sourceId:String
    val time:Date
    val senderId:String
    val recipientId:String
    val senderPhoneNumber:String
    val type:String
}

