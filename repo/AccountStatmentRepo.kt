package com.joincoded.androidaccountstatment.repo

import com.joincoded.androidaccountstatment.TransactionType.TransactionType
import com.joincoded.androidaccountstatment.data.AccountStatment
class AccountStatmentRepo {

    companion object {
        var dummyStatmentList = listOf(
            AccountStatment("Fatma Account ",  200000.8, " 1-1-2024", TransactionType.Deposite, " KWD")
        )
    }
}

