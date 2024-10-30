case class Transaction(
                        orderId: String,
                        tradeId: Long,
                        CryptoPair: String,
                        baseCurrency: String,
                        tradeCompletionTime: String,
                        side: String,
                        avgPrice: Double,
                        quantity: Double,
                        grossAmount: Double,
                        fees: Double,
                        netAmountInBaseCurrency: Double,
                        netAmountInInr: Double,
)




//2c86f3d2-a763-11ed-bc09-47278a2cc37f,
// 69538296,MATICINR,INR,2023-02-08 09:17:04,sell,106.89,0.240538,25.71110682,0.128555534,25.58255129,25.58255129





//  val orderId = "Order ID"
//  val tradeId = "Trade ID"
//  val CryptoPair = "Crypto Pair"
//  val baseCurrency = "Base currency"
//  val tradeCompletionTime = "Trade Completion time"
//  val side = "Side (Buy/Sell)"
//  val avgPrice = "Avg Buying/Selling Price(in base currency)"
//  val quantity = "Quantity"
//  val grossAmount = "Gross Amount Paid/Received by the user(in base currency)"
//  val fees = "Fees(in base currency)"
//  val netAmountInBaseCurrency = "Net Amount Paid/Received by the user(in base currency)"
//  val netAmountInInr = "*Net Amount Paid/Received by the user (in INR)"