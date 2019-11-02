package com.sda.patherns.behavioral.memento.ex2.history;

import com.sda.patherns.behavioral.memento.ex2.editor.Editor;

public class Memento {

    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
