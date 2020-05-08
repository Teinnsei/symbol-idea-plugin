package io.galagutskiy.idea.plugin.symbol;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class SymbolTemplateContextType extends TemplateContextType {

    protected SymbolTemplateContextType() {
        super("SYMBOL", "Symbol");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.isWritable();
    }
}
