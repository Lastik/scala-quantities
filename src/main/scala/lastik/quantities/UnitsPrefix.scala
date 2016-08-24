package lastik.quantities

trait UnitsPrefix {
  def aliases: List[String]

  def factor: Double
}

case object Googol extends UnitsPrefix {
  val aliases = List("googol")

  val factor = 1e100
}

case object Kibi extends UnitsPrefix {
  val aliases = List("Ki", "Kibi", "kibi")

  val factor = Math.pow(2, 10)
}

case object Mebi extends UnitsPrefix {
  val aliases = List("Mi", "Mebi", "mebi")

  val factor = Math.pow(2, 20)
}

case object Gibi extends UnitsPrefix {
  val aliases = List("Gi", "Gibi", "gibi")

  val factor = Math.pow(2, 30)
}

case object Tebi extends UnitsPrefix {
  val aliases = List("Ti", "Tebi", "tebi")

  val factor = Math.pow(2, 40)
}

case object Pebi extends UnitsPrefix {
  val aliases = List("Pi", "Pebi", "pebi")

  val factor = Math.pow(2, 50)
}

case object Exi extends UnitsPrefix {
  val aliases = List("Ei", "Exi", "exi")

  val factor = Math.pow(2, 60)
}

case object Peta extends UnitsPrefix {
  val aliases = List("P", "Peta", "peta")
  val factor = 1e15
}

case object Tera extends UnitsPrefix {
  val aliases = List("T", "Tera", "tera")
  val factor = 1e12
}

case object Giga extends UnitsPrefix {
  val aliases = List("G", "Giga", "giga")
  val factor = 1e9
}

case object Mega extends UnitsPrefix {
  val aliases = List("M", "Mega", "mega")
  val factor = 1e6
}

case object Kilo extends UnitsPrefix {
  val aliases = List("k", "kilo")
  val factor = 1e3
}

case object Hecto extends UnitsPrefix {
  val aliases = List("h", "Hecto", "hecto")
  val factor = 1e2
}

case object Deca extends UnitsPrefix {
  val aliases = List("da", "Deca", "deca", "deka")
  val factor = 1e1
}

case object Deci  extends UnitsPrefix {
  val aliases = List("d", "Deci", "deci")
  val factor = 1e-1
}

case object Centi extends UnitsPrefix {
  val aliases = List("c", "Centi", "centi")
  val factor = 1e-2
}

case object Milli extends UnitsPrefix {
  val aliases = List("m", "Milli", "milli")
  val factor = 1e-3
}

case object Micro extends UnitsPrefix{
  val aliases = List(
    "u",
    "\u03BC"/*µ as greek letter*/,
    "\u00B5"/*µ as micro sign*/,
    "Micro","mc","micro")

  val factor =  1e-6
}

case object Nano  extends UnitsPrefix {
  val aliases = List("n", "Nano", "nano")
  val factor = 1e-9
}

case object Pico  extends UnitsPrefix {
  val aliases = List("p", "Pico", "pico")
  val factor = 1e-12
}

case object Femto extends UnitsPrefix {
  val aliases = List("f", "Femto", "femto")
  val factor = 1e-15
}

case object Atto  extends UnitsPrefix {
  val aliases = List("a", "Atto", "atto")
  val factor = 1e-18
}

case object Zepto extends UnitsPrefix {
  val aliases = List("z", "Zepto", "zepto")
  val factor = 1e-21
}

case object Yocto extends UnitsPrefix {
  val aliases = List("y", "Yocto", "yocto")
  val factor = 1e-24
}