package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait SpeedUnits extends UnitsOfMeasurement

case object Kph extends SpeedUnits {
  val aliases = List("kph")
  val factor = 0.277777778
}

case object Mph extends SpeedUnits {
  val aliases = List("mph")
  val factor = 0.44704
}

case object Knot extends SpeedUnits {
  val aliases = List("kt", "kn", "kts", "knot", "knots")
  val factor = 0.514444444
}

case object Fps extends SpeedUnits {
  val aliases = List("fps")
  val factor = 0.3048
}
