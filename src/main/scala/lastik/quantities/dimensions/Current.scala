package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait CurrentUnits extends UnitsOfMeasurement

case object Ampere extends CurrentUnits {
  val aliases = List("A", "Ampere", "ampere", "amp", "amps")
  val factor = 1.0
}