package adt.color

final case class Color(r: Double, g: Double, b: Double) {

  def lightness: Double = (r + g + b) / 3

  def lighterThan(other:Color):Boolean = lightness > other.lightness
}

object Main extends App {
  val color1 = Color(1.0, 0.5, 0.0)
  val color2 = Color(0.6, 0.7, 0.8)

  println("color1 " + color1)
  println("color2 " + color2)

  println("Lightness of color1 " + color1.lightness)
  println("Lightness of color2 " + color2.lightness)

  def mostlyRed(color: Color):Boolean = color.r >= color.g && color.r >= color.b

  println("Is color1 mostly red? " + mostlyRed(color1))
  println("Is color2 mostly red? " + mostlyRed(color2))
}
