package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait AreaUnits extends UnitsOfMeasurement

case object Hectare extends AreaUnits {
  val aliases = List("hectare")
  val factor = 10000
}

case object Acre extends AreaUnits {
  val aliases = List("acre", "acres")
  val factor = 4046.85642
}

case object Sqft extends AreaUnits {
  val aliases = List("sqft")
  val factor = 1
}