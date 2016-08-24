package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait TemperatureUnits extends UnitsOfMeasurement

case object Kelvin extends TemperatureUnits {
  val aliases = List("degK", "kelvin")
  val factor = 1.0
}

case object Celsius extends TemperatureUnits {
  val aliases = List("degC", "celsius", "celsius", "centigrade")
  val factor = 1.0
}

case object Fahrenheit extends TemperatureUnits {
  val aliases = List("degF", "fahrenheit")
  val factor = 5 / 9
}

case object Rankine extends TemperatureUnits {
  val aliases = List("degR", "rankine")
  val factor = 5 / 9
}