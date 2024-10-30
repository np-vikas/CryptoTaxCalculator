import play.api.libs.json.{Json, OFormat}

case class CryptoTransaction(
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

object CryptoTransaction {
  implicit val formats : OFormat[CryptoTransaction] = Json.format[CryptoTransaction]
}
