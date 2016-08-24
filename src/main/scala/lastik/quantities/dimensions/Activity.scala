package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait ActivityUnits extends UnitsOfMeasurement

case object Katal extends ActivityUnits {
  val aliases = List("kat", "katal", "Katal")
  val factor = 1.0
}

case object Unit extends ActivityUnits {
  val aliases = List("U", "enzUnit")
  val factor = 16.667e-16
}