package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait CapacityUnits extends UnitsOfMeasurement

case object Farad extends CapacityUnits {
  val aliases = List("F", "farad", "Farad")
  val factor = 1.0
}
