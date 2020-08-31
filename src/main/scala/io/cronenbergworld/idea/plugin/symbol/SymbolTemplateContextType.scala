package io.cronenbergworld.idea.plugin.symbol

import com.intellij.codeInsight.template._
import org.jetbrains.annotations.Nls

abstract class SymbolTemplateContextType(id: String, @Nls presentableName: String)
    extends TemplateContextType(id, presentableName) {
  override def isInContext(templateActionContext: TemplateActionContext): Boolean =
    templateActionContext.getFile.isWritable
}
