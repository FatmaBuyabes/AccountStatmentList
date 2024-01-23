package com.joincoded.androidaccountstatment.data

import android.telecom.Call.Details
import com.joincoded.androidaccountstatment.TransactionType.TransactionType
import java.util.Currency

data class AccountStatment( var name: String,
                            var amount: Double,
                            var date: String,
                            var transactionType: TransactionType,
                            var currency: String)
