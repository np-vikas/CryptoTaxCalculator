import com.github.tototoshi.csv.CSVReader

import java.io.File
import com.github.tototoshi.csv._
import play.api.libs.json.Format.GenericFormat

//import org.json4s._
//import org.json4s.native.JsonMethods._
//import org.json4s.JsonFormat.GenericFormat
import play.api.libs.json._

object CryptoTaxCalculator extends App {
  val filename = "src/main/resources/transactions2.csv"
//  val reader = CSVReader.open(new File(filename))
//  val allRows = reader.allWithHeaders()
//  reader.close()

  val orderId = "Order ID"
  val tradeId = "Trade ID"
  val CryptoPair = "Crypto Pair"
  val baseCurrency = "Base currency"
  val tradeCompletionTime = "Trade Completion time"
  val side = "Side (Buy/Sell)"
  val avgPrice = "Avg Buying/Selling Price(in base currency)"
  val quantity = "Quantity"
  val grossAmount = "Gross Amount Paid/Received by the user(in base currency)"
  val fees = "Fees(in base currency)"
  val netAmountInBaseCurrency = "Net Amount Paid/Received by the user(in base currency)"
  val netAmountInInr = "*Net Amount Paid/Received by the user (in INR)"

  val csvJsonStr = CSVToJSON.csvFileToJson(filename)
  val csvJsons = Json.parse(csvJsonStr).as[JsArray]


//  implicit val formats = DefaultFormats

//  val transactions = csvJsons.map(_.extract[])
  println(csvJsons)




}
