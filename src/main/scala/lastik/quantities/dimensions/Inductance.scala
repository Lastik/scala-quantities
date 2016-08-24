package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait InductanceUnits extends UnitsOfMeasurement

case object Henry extends InductanceUnits {
  val aliases = List("H", "Henry", "henry")
  val factor = 1.0
}