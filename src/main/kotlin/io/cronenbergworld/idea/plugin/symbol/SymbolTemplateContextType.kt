package io.cronenbergworld.idea.plugin.symbol

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NotNull

abstract class SymbolTemplateContextType(id: @NotNull String, presentableName: @Nls @NotNull String)
    : TemplateContextType(id, presentableName) {

    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.isWritable
    }
}