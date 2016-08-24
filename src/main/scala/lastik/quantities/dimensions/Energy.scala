package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait EnergyUnits extends UnitsOfMeasurement

case object Joule extends EnergyUnits {
  val aliases = List("J", "joule", "Joule", "joules")
  val factor = 1.0
}

case object Erg extends EnergyUnits {
  val aliases = List("erg", "ergs")
  val factor = 1e-7
}

case object Btu extends EnergyUnits {
  val aliases = List("BTU", "btu", "BTUs")
  val factor = 1055.056
}

case object CalorieLowC extends EnergyUnits {
  val aliases = List("cal", "calorie", "calories")
  val factor = 4.18400
}

case object CalorieCapC extends EnergyUnits {
  val aliases = List("Cal", "Calorie", "Calories")
  val factor = 4184.00
}

case object ThermUS extends EnergyUnits {
  val aliases = List("th", "therm", "therms", "Therm")
  val factor = 105480400
}

case object Wh extends EnergyUnits {
  val aliases = List("Wh")
  val factor = 3600
}