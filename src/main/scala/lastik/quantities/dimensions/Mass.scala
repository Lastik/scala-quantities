package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait MassUnits extends UnitsOfMeasurement

case object Kilogram extends MassUnits {
  val aliases = List("kg", "kilogram", "kilograms")
  val factor = 1.0
}

case object AMU extends MassUnits {
  val aliases = List("u", "AMU", "amu")
  val factor = 1.660538921e-27
}

case object Dalton extends MassUnits {
  val aliases = List("Da", "Dalton", "Daltons", "dalton", "daltons")
  val factor = 1.660538921e-27
}

case object Slug extends MassUnits {
  val aliases = List("slug", "slugs")
  val factor = 14.5939029
}

case object ShortTon extends MassUnits {
  val aliases = List("tn", "ton")
  val factor = 907.18474
}

case object MetricTon extends MassUnits {
  val aliases = List("tonne")
  val factor = 1000
}

case object Carat extends MassUnits {
  val aliases = List("ct", "carat", "carats")
  val factor = 0.0002
}

case object Pound extends MassUnits {
  val aliases = List("lbs", "lb", "pound", "pounds", "#")
  val factor = 0.45359237
}

case object Ounce extends MassUnits {
  val aliases = List("oz", "ounce", "ounces")
  val factor = 0.0283495231
}

case object Gram extends MassUnits {
  val aliases = List("g", "gram", "grams", "gramme", "grammes")
  val factor = 1e-3
}

case object Grain extends MassUnits {
  val aliases = List("grain", "grains", "gr")
  val factor = 6.479891e-5
}

case object Dram extends MassUnits {
  val aliases = List("dram", "drams", "dr")
  val factor = 0.0017718452
}

case object Stone extends MassUnits {
  val aliases = List("stone", "stones", "st")
  val factor = 6.35029318
}
