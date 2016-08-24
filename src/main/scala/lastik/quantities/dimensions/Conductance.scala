package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait ConductanceUnits extends UnitsOfMeasurement

case object Siemens extends ConductanceUnits {
  val aliases = List("S", "Siemens", "siemens")
  val factor = 1.0
}