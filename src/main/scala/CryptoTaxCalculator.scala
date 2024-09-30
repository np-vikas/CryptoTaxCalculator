import com.github.tototoshi.csv.CSVReader

import java.io.File
import com.github.tototoshi.csv._

object CryptoTaxCalculator extends App {
  val filename = "src/main/resources/transactions.csv"
  val reader = CSVReader.open(new File(filename))
  val allRows = reader.allWithHeaders()
  reader.close()

  allRows.foreach(println)

}
