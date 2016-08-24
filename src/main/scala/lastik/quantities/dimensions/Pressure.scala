package lastik.quantities.dimensions

import lastik.quantities.UnitsOfMeasurement

trait PressureUnits extends UnitsOfMeasurement

case object Pascal extends PressureUnits {
  val aliases = List("Pa", "pascal", "Pascal")
  val factor = 1.0
}

case object Bar extends PressureUnits {
  val aliases = List("bar", "bars")
  val factor = 100000
}

case object MmHg extends PressureUnits {
  val aliases = List("mmHg")
  val factor = 133.322368
}

case object InHg extends PressureUnits {
  val aliases = List("inHg")
  val factor = 3386.3881472
}

case object Torr extends PressureUnits {
  val aliases = List("torr")
  val factor = 133.322368
}

case object Atm extends PressureUnits {
  val aliases = List("atm", "ATM", "atmosphere", "atmospheres")
  val factor = 101325
}

case object Psi extends PressureUnits {
  val aliases = List("psi")
  val factor = 6894.76
}

case object Cmh2o extends PressureUnits {
  val aliases = List("cmH2O")
  val factor = 98.0638
}

case object Inh2o extends PressureUnits {
  val aliases = List("inH2O")
  val factor = 249.082052
}