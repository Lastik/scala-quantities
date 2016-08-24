package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait ConcentrationUnits extends UnitsOfMeasurement

case object Molar extends ConcentrationUnits {
  val aliases = List("M", "molar")
  val factor = 1000
}

case object Wtpercent extends ConcentrationUnits {
  val aliases = List("wt%", "wtpercent")
  val factor = 10
}
