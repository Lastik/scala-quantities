package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait MagnetismUnits extends UnitsOfMeasurement

case object Weber extends MagnetismUnits {
  val aliases = List("Wb", "weber", "webers")
  val factor = 1.0
}

case object Tesla extends MagnetismUnits {
  val aliases = List("T", "tesla", "teslas")
  val factor = 1.0
}

case object Gauss extends MagnetismUnits {
  val aliases = List("G", "gauss")
  val factor = 1e-4
}

case object Maxwell extends MagnetismUnits {
  val aliases = List("Mx", "maxwell", "maxwells")
  val factor = 1e-8
}

case object Oersted extends MagnetismUnits {
  val aliases = List("Oe", "oersted", "oersteds")
  val factor = 250.0 / Math.PI
}
