package main.scala

class checkoutSystem {
  val appleCost: Double = 0.6
  val orangeCost: Double = 0.25

  def calcBill(checkoutItems: Array[String]): Double = {
    var totalBill: Double = 0.0
    val appleCount = checkoutItems.count(_ == "Apple")
    val orangeCount = checkoutItems.count(_ == "Orange")
    totalBill = (appleCount * appleCost) + (orangeCount * orangeCost)
    totalBill
  }
}

object main {
  def main(args: Array[String]): Unit = {
    val shopC = new checkoutSystem()
    val cItems: Array[String] = Array("Apple", "Apple","Orange","Orange","Orange","Orange","Apple")
    val bill: Double = shopC.calcBill(cItems)
    print("Bill = %.2f".format(bill))
  }
}
