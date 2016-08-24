package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait ChargeUnits extends UnitsOfMeasurement

case object Coulomb extends ChargeUnits {
  val aliases = List("C", "coulomb", "Coulomb")
  val factor = 1.0
}

case object Ah extends ChargeUnits {
  val aliases = List("Ah")
  val factor = 3600
}