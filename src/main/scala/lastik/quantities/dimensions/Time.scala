package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait TimeUnits extends UnitsOfMeasurement

case object Second extends TimeUnits {
  val aliases = List("s", "sec", "secs", "second", "seconds")
  val factor = 1.0
}

case object Minute extends TimeUnits {
  val aliases = List("min", "mins", "minute", "minutes")
  val factor = 60.0
}

case object Hour extends TimeUnits {
  val aliases = List("h", "hr", "hrs", "hour", "hours")
  val factor = 3600.0
}

case object Day extends TimeUnits {
  val aliases = List("d", "day", "days")
  val factor = 3600 * 24
}

case object Week extends TimeUnits {
  val aliases = List("wk", "week", "weeks")
  val factor = 7 * 3600 * 24
}

case object Fortnight extends TimeUnits {
  val aliases = List("fortnight", "fortnights")
  val factor = 1209600
}

case object Year extends TimeUnits {
  val aliases = List("y", "yr", "year", "years", "annum")
  val factor = 31556926
}

case object Decade extends TimeUnits {
  val aliases = List("decade", "decades")
  val factor = 315569260
}

case object Century extends TimeUnits {
  val aliases = List("century", "centuries")
  val factor = 3155692600d
}
