package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait VolumeUnits extends UnitsOfMeasurement

case object Liter extends VolumeUnits {
  val aliases = List("l", "L", "liter", "liters", "litre", "litres")
  val factor = 0.001
}

case object Gallon extends VolumeUnits {
  val aliases = List("gal", "gallon", "gallons")
  val factor = 0.0037854118
}

case object Quart extends VolumeUnits {
  val aliases = List("qt", "quart", "quarts")
  val factor = 0.00094635295
}

case object Pint extends VolumeUnits {
  val aliases = List("pt", "pint", "pints")
  val factor = 0.000473176475
}

case object Cup extends VolumeUnits {
  val aliases = List("cu", "cup", "cups")
  val factor = 0.000236588238
}

case object FluidOunce extends VolumeUnits {
  val aliases = List("floz", "fluid-ounce", "fluid-ounces")
  val factor = 2.95735297e-5
}

case object Tablespoon extends VolumeUnits {
  val aliases = List("tb", "tbsp", "tbs", "tablespoon", "tablespoons")
  val factor = 1.47867648e-5
}

case object Teaspoon extends VolumeUnits {
  val aliases = List("tsp", "teaspoon", "teaspoons")
  val factor = 4.92892161e-6
}

case object Bushel extends VolumeUnits {
  val aliases = List("bu", "bsh", "bushel", "bushels")
  val factor = 0.035239072
}