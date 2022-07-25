package test.scala
import main.scala.checkoutSystem
import org.scalatest.funsuite.AnyFunSuite

class checkoutSystemTest extends AnyFunSuite {
  val sc = new checkoutSystem
  test("No Offer - Success Test1") {
    assert(sc.calcBill(Array("Apple","Orange")) === 0.85)
  }

  test("No Offer - Failure Test") {
    assert(sc.calcBill(Array("Apple","Apple","Orange")) === 0.85)
  }

}
