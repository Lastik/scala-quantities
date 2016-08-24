package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait PotentialUnits extends UnitsOfMeasurement

case object Volt extends PotentialUnits {
  val aliases = List("V", "Volt", "volt", "volts")
  val factor = 1.0
}
