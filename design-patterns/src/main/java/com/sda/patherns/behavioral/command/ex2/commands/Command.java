package com.sda.patherns.behavioral.command.ex2.commands;

import com.sda.patherns.behavioral.command.ex2.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
