package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait ResistanceUnits extends UnitsOfMeasurement

case object Ohm extends ResistanceUnits {

  val aliases = List(
    "Ohm", "ohm",
    "\u03A9" /*Ω as greek letter*/ ,
    "\u2126" /*Ω as ohm sign*/)

  val factor = 1.0
}