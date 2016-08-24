package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait AccelerationUnits extends UnitsOfMeasurement

case object Gee extends AccelerationUnits {
  val aliases = List("gee")
  val factor = 9.80665
}