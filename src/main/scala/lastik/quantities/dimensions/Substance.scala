package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait SubstanceUnits extends UnitsOfMeasurement

case object Mole extends SubstanceUnits {
  val aliases = List("mol", "mole")
  val factor = 1.0
}
