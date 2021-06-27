package com.github.teinnsei.plugin.symbol

import com.intellij.codeInsight.template.*

abstract class SymbolTemplateContextType(id: String, presentableName: String)
    extends TemplateContextType(id, presentableName):

  override def isInContext(templateActionContext: TemplateActionContext): Boolean =
    templateActionContext.getFile.isWritable
