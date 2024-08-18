package com.github.teinnsei.plugin.symbol

import com.intellij.codeInsight.template.*

abstract class SymbolTemplateContextType(presentableName: String)
    extends TemplateContextType(presentableName):

  override def isInContext(templateActionContext: TemplateActionContext): Boolean =
    templateActionContext.getFile.isWritable
