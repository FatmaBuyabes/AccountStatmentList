package com.joincoded.androidaccountstatment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joincoded.androidaccountstatment.TransactionType.TransactionType
import com.joincoded.androidaccountstatment.composable.AccountStatmentCard
import com.joincoded.androidaccountstatment.data.AccountStatment
import com.joincoded.androidaccountstatment.repo.AccountStatmentRepo
import com.joincoded.androidaccountstatment.ui.theme.AndroidAccountStatmentTheme

class MainActivity : ComponentActivity() {
    var statmentList = AccountStatmentRepo.dummyStatmentList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAccountStatmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StatmentListScreen(statmentList)
                }
            }
        }
    }
}

@Composable
fun StatmentListScreen(statmentList: List<AccountStatment>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(statmentList) { statments ->
            AccountStatmentCard(
                name = statments.name,
                amount = statments.amount,
                date = statments.date,
                transactionType = statments.transactionType,
                currency = statments.currency
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAccountStatmentTheme {
        StatmentListScreen(AccountStatmentRepo.dummyStatmentList)
    }
}