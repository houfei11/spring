package com.imooc;

/**
 * @author Administrator
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("开始检查。。。。");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellChecker(){
        spellChecker.checkSpelling();
    }
}
