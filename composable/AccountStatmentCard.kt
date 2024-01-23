package com.joincoded.androidaccountstatment.composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joincoded.androidaccountstatment.R
import com.joincoded.androidaccountstatment.TransactionType.TransactionType
import com.joincoded.androidaccountstatment.data.AccountStatment


@Composable
fun AccountStatmentCard(name: String,
                        amount: Double,
                        date: String,
                        transactionType: TransactionType,
                        currency: String,
                        modifier: Modifier= Modifier
                        ){
    Card (modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(8.dp))  {
        Row(modifier= modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text= stringResource(R.string.statmentaccount, name))
            Text(text="$amount $currency")
            Text(text="$transactionType")
            Text(text= stringResource(R.string.statmentdate, date))
            }

        }

    }

@Preview(showBackground =true)
@Composable
fun AccountStatmentPreview() {
    AccountStatmentCard(
        name = "Fatma",
        amount=2000.5,
        transactionType = TransactionType.Withdraw,
        date="1-1-2024",
        currency = "KWD")


}
