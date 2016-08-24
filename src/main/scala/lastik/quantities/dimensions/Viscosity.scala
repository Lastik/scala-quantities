package lastik.quantities.dimensions

trait ViscosityUnits

case object Poise extends ViscosityUnits {
  val aliases = List("P", "poise")
  val factor = 0.1
}

case object Stokes extends ViscosityUnits {
  val aliases = List("St", "stokes")
  val factor = 1e-4
}