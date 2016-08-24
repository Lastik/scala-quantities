package lastik.quantities

trait UnitsOfMeasurement {
  def factor: Double

  def aliases: List[String]
}
