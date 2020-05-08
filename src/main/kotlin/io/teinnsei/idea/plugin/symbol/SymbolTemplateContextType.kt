package io.teinnsei.idea.plugin.symbol

import com.intellij.codeInsight.template.TemplateContextType
import com.intellij.psi.PsiFile
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NotNull

abstract class SymbolTemplateContextType(id: @NotNull String, presentableName: @Nls @NotNull String)
    : TemplateContextType(id, presentableName) {

    final override fun isInContext(file: PsiFile, offset: Int): Boolean {
        return file.isWritable
    }
}