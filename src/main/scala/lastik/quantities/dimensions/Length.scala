package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait LengthUnits extends UnitsOfMeasurement

case object Meter extends LengthUnits {
  val aliases = List("m", "meter", "meters", "metre", "metres")
  val factor = 1.0
}

case object Inch extends LengthUnits {
  val aliases = List("in", "inch", "inches", "\"")
  val factor = 0.0254
}

case object Foot extends LengthUnits {
  val aliases = List("ft", "foot", "feet", "'")
  val factor = 0.3048
}

case object Yard extends LengthUnits {
  val aliases = List("yd", "yard", "yards")
  val factor = 0.9144
}

case object Mile extends LengthUnits {
  val aliases = List("mi", "mile", "miles")
  val factor = 1609.344
}

case object NauticalMile extends LengthUnits {
  val aliases = List("nmi")
  val factor = 1852
}

case object League extends LengthUnits {
  val aliases = List("league", "leagues")
  val factor = 4828
}

case object Furlong extends LengthUnits {
  val aliases = List("furlong", "furlongs")
  val factor = 201.2
}

case object Rod extends LengthUnits {
  val aliases = List("rd", "rod", "rods")
  val factor = 5.029
}

case object Mil extends LengthUnits {
  val aliases = List("mil", "mils")
  val factor = 0.0000254
}

case object Angstrom extends LengthUnits {
  val aliases = List("ang", "angstrom", "angstroms")
  val factor = 1e-10
}

case object Fathom extends LengthUnits {
  val aliases = List("fathom", "fathoms")
  val factor = 1.829
}

case object Pica extends LengthUnits {
  val aliases = List("pica", "picas")
  val factor = 0.00423333333
}

case object Point extends LengthUnits {
  val aliases = List("pt", "point", "points")
  val factor = 0.000352777778
}

case object Redshift extends LengthUnits {
  val aliases = List("z", "red-shift")
  val factor = 1.302773e26
}

case object AU extends LengthUnits {
  val aliases = List("AU", "astronomical-unit")
  val factor = 149597900000d
}

case object LightSecond extends LengthUnits {
  val aliases = List("ls", "light-second")
  val factor = 299792500
}

case object LightMinute extends LengthUnits {
  val aliases = List("lmin", "light-minute")
  val factor = 17987550000d
}

case object LightYear extends LengthUnits {
  val aliases = List("ly", "light-year")
  val factor = 9460528000000000d
}

case object Parsec extends LengthUnits {
  val aliases = List("pc", "parsec", "parsecs")
  val factor = 30856780000000000d
}