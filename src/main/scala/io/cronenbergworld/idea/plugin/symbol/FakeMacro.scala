package io.cronenbergworld.idea.plugin.symbol

import com.github.javafaker.Faker
import com.intellij.codeInsight.template._

class FakeMacro extends Macro {
  import FakeMacro._

  override val getName: String            = "fakeMacro"
  override val getPresentableName: String = "FakeMacro"

  override def calculateResult(params: Array[Expression], context: ExpressionContext): Result = {
    if (params.length != 1) return new TextResult("")
    val function = params(0).calculateResult(context).asInstanceOf[TextResult].getText
    val functions = function.split("\\.").tail
    val firstFunction = clazz.getDeclaredMethod(functions(0))
    val innerObject = firstFunction.invoke(faker)
    val secondFunction = innerObject.getClass.getDeclaredMethod(functions(1))
    val randomValue = secondFunction.invoke(innerObject).toString
    new TextResult(randomValue)
  }
}

object FakeMacro {
  private val faker = Faker.instance()
  private val clazz = faker.getClass
}